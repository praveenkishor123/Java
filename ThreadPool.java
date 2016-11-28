package coreJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	private int id;
	
	public Processor(int id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println("Starting: " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Completed: " + id);
	}
	
}

public class ThreadPool {
	
	public static void main(String[] args) {
		
		// This will create 2 worker threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<5; i++) {
			executor.submit(new Processor(i));
		}
		
		// This will not shutdown the tasks immediately
		// rather it will wait for the threads to complete
		// their tasks what they are doing
		executor.shutdown();
		
		System.out.println("All tasks submitted");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
		}
		
		System.out.println("All tasks completed");
	}

}


//Output
//---------
//Starting: 0
//All tasks submitted
//Starting: 1
//Completed: 0
//Starting: 2
//Completed: 1
//Starting: 3
//Completed: 2
//Starting: 4
//Completed: 3
//Completed: 4
//All tasks completed
