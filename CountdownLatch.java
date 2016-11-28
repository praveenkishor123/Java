package coreJava;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;


// CountDownLatch in Java is a kind of synchronizer which allows only one Thread to
// wait for one or more Threads before starts processing.
// This is often needed in server side core java application.
// It is introduced from Java 5 in java.util.concurrent package

// The functionality which we are going to achieve through CountDownLatch can 
// also be achieved by wait and notify mechanism, but it requires a lot of code to write.
// CountDownLatch also allows flexibility on number of thread for which
// main thread should wait.

public class CountdownLatch {

	// CountDownLatch works in latch principle, main thread will wait until Gate
	// is open.
	// One thread waits for n number of threads specified while creating
	// CountDownLatch in Java.
	// Any thread, usually main thread of application, which calls
	// CountDownLatch.await() will wait until count reaches zero
	// or its interrupted by another Thread.
	// All other thread are required to do count down by calling
	// CountDownLatch.countDown()
	// once they are completed or ready to the job. as soon as count reaches
	// zero, Thread
	// awaiting starts running.

	// One of the disadvantage of CountDownLatch is that its not reusable once
	// count
	// reaches to zero you can not use CountDownLatch any more, but don't worry
	// Java concurrency API has another concurrent utility called CyclicBarrier
	// for such requirements.

	public static void main(String args[]) {

		final CountDownLatch latch = new CountDownLatch(3);

		Thread cacheService = new Thread(new Service("CacheService", 1000, latch));

		Thread alertService = new Thread(new Service("AlertService", 1000, latch));

		Thread validationService = new Thread(new Service("ValidationService", 1000, latch));

		cacheService.start(); // separate thread will initialize CacheService

		alertService.start(); // another thread for AlertService initialization
		
		validationService.start();
		
		 try{
	            latch.await();  //main thread is waiting on CountDownLatch to finish
	            System.out.println("All services are up, Application is starting now");
	       }catch(InterruptedException ie){
	           ie.printStackTrace();
	       }
	      
	    }
	  
}

class Service implements Runnable{
    private final String name;
    private final int timeToStart;
    private final CountDownLatch latch;
  
    public Service(String name, int timeToStart, CountDownLatch latch){
        this.name = name;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }
  
    public void run() {
        try {
            Thread.sleep(timeToStart);
        } catch (InterruptedException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println( name + " is Up");
        latch.countDown(); //reduce count of CountDownLatch by 1
    }
  
}


//
//Output
//--------------
//ValidationService is Up
//AlertService is Up
//CacheService is Up
//All services are up, Application is starting now
