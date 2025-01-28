package demo.programming;

import java.util.List;

public class FP01Structured {
	
	private static void main(String[] args) {
		run();
	}


	public static void run() {

		printAllNumbersInList(List.of(3, 1, 2, 9, 7, 56, 1, 3, 10));
	}

	public static void printAllNumbersInList(List<Integer> input) {
		for (int inp : input) {
			System.out.println(inp);
		}

	}

}
