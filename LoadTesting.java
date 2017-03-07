import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author praveen kishor
 *
 */

// BlockingQueue is an interface.
// It works on producer-consumer pattern.

class Request {
}

class Client implements Runnable {

	private BlockingQueue<Request> queue;

	Client(BlockingQueue<Request> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			Request req = null;

			while (true) {
				req = new Request();
				queue.put(req);
				System.out.println("Added request - " + req);
				
				Thread.sleep(2000);

			}
		}

		catch (InterruptedException ex) {
			System.out.println(ex);
		}

	}

}

class Server implements Runnable {

	private BlockingQueue<Request> queue;

	Server(BlockingQueue<Request> queue) {
		this.queue = queue;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			while(true) {
				System.out.println("Processing ... " + queue.take());
			}
		}
		
		catch(InterruptedException ex) {
			System.out.println(ex);
		}

	}

}

public class LoadTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<Request> queue = new ArrayBlockingQueue<Request>(3);
		
		Client client = new Client(queue);
		
		Server server = new Server(queue);
		
		new Thread(client).start();
		
		new Thread(server).start();
		
		

	}

}
