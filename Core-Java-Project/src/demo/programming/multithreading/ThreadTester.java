package demo.programming.multithreading;

public class ThreadTester {

	public static void main(String[] args) {
		System.out.println("Main thread started");

//		Thread1 myThread1 = new Thread1("thread1");
//		myThread1.setDaemon(true);
//		myThread1.start();

//		Thread myThread2 = new Thread(() -> 
//		{
//			for (int i = 0; i < 5; i++) 
//				System.out.println("Inside " + Thread.currentThread() + " " + i);
//		});
//		myThread2.start();
//		System.out.println("Exiting main thread");

		Stack stack = new Stack(10);

		new Thread(() -> {
			int counter = 0;
			while (++counter < 10)
				System.err.println("Pushed: " + stack.push(100));
		}, "pusher").start();

		new Thread(() -> {
			int counter = 0;
			while (++counter < 10)
				System.err.println("Popped: " + stack.pop());
		}, "Popped").start();
		
		System.out.println("Exiting main thread");

	}

}
