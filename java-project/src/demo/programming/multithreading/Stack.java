package demo.programming.multithreading;

public class Stack {
	private int[] array;
	private int stackTop;
	public volatile boolean bol;

	public Stack(int capacity) {
		array = new int[capacity];
		stackTop = -1;
	}

	private boolean isEmpty() {
		return stackTop < 0;
	}

	private boolean isFull() {
		return stackTop > array.length - 1;
	}

	public synchronized boolean push(int element) {
		System.out.println("Entered the push method");
		if (isFull())return false;
		++stackTop;

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		System.out.println("stackTop value: " + stackTop);
		array[stackTop] = element;
		return true;
	}

	public synchronized int pop() {
		System.out.println("Entered the pop method");
		if (isEmpty())return Integer.MIN_VALUE;
		int obj = array[stackTop];
		array[stackTop] = Integer.MIN_VALUE;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println("stackTop value before change" + stackTop);
		stackTop--;
		System.out.println("stackTop value after change" + stackTop);
		return obj;
	}

}
