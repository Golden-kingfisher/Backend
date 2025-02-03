package demo.programming.multithreading;

public class ThreadTester {
	private static final Object lock = new Object();

	public void executeRun() {
		System.out.println("Main thread started");

//		executeWaitOperation();
		executeSynchronisationOperation();
//		executeThreadSleep();
//		executeThreadWait();
	}

	private void executeWaitOperation() {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				synchronized (lock) {
					try {
						System.out.println("Thread 1 is going to wait state...");
						lock.wait(); // This thread will wait
						System.out.println("Thread 1 resumed.");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		thread1.start();

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				synchronized (lock) {
					try {
						System.out.println("Before putting t2 to sleep");
						Thread.sleep(2000); // Simulate some work
						System.out.println("Thread 2 notifying...");
						lock.notify(); // This will wake up thread 1
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		thread1.start();
		thread2.start();
	}

	private void executeThreadSleep() {

		new Thread(() -> {
			try {
				System.out.println("Before thread going to sleep");
				Thread.sleep(3000);
				System.out.println("After thread woke up from sleep");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}).start();
	}

	private void executeThreadWait() {

		new Thread(() -> {
			synchronized (lock) {
				try {
					System.out.println("Before thread 1 going to wait");
					lock.wait();
					System.out.println("After thread 1 woke up from wait");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}).start();

//		Thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("Before Thread 2 going to sleep");
					Thread.sleep(10000);
					System.out.println("After Thread 2 woke from sleep");
					synchronized (lock) {
						lock.notify();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		thread2.start();

	}

	private void executeSynchronisationOperation() {
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
