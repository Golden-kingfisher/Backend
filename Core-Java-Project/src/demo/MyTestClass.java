package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import demo.programming.OptionalClass;
import demo.programming.StreamApi;

public class MyTestClass {

	public void run() {

		StreamApi streamApi = new StreamApi();
		
		List<String> courses = List.of("Spring", "Spring boot", "AWS", "Devops", "Reactjs", "SQL");
		
//		executeReverseLettersFromString();
//		executeLengthOfEachWord(courses);

//		OptionalClass optionalClass = new OptionalClass();
//		optionalClass.executePredicateOnList();
//		executeGetCountOfMaximumBallsInBasket();
//		executeRearrangeZerosInArray();
		streamApi.executeSortingGivenElements();

	}
	

	public void executeGetCountOfMaximumBallsInBasket() {
		List<Integer> lst1 = List.of(5, 10, 4, 3, 11, 15, 3);
//		5, 10, 20, 25, 30, 15, 0

//		Integer[] arr = {5, 10, 4, 3, 11, 15, 3};
//		List<Integer> asList = Arrays.asList(arr);

		ArrayList<Integer> arrayList = new ArrayList<>(lst1);

		Collections.sort(arrayList);

		System.out.println("sorted" + arrayList);

		int basket1 = 0;
		int basket2 = 0;

		for (int i = 0; i < arrayList.size() - 1; i++) {
			int previousIndex = i - 1;
			if (previousIndex >= 0) {
				int val = (arrayList.get(i) - arrayList.get(previousIndex));
				if (val <= 1)
					++basket1;
				else
					++basket2;
			}
		}
		int totalCount = (basket1 > basket2) ? basket1 : basket2;

		System.out.println("Total count of balls in a basket : " + totalCount);
//		return (basket1 > basket2 ? basket1 : basket2);
	}

	public void executeRearrangeZerosInArray() {
		// your code goes here
// 		Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.
		Integer[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
		List<Integer> alist = Arrays.asList(arr);
//		 List<Integer> arList = List.of(arr);

		List<Integer> arList = new ArrayList<>(alist);
//		arList.sort(null);
//		Collections.sort(arList);
//		Collections.sort(arList, Collections.reverseOrder(null));

		int zeroCount = 0;
		for (int i = 0; i < arList.size(); i++) {
			if (arList.get(i) == 0) {
				arList.remove(i);
				zeroCount++;
			}
		}

		for (int i = 0; i < zeroCount; i++) {
			arList.add(0);
		}

		System.out.println(arList);
	}

	public void executeReverseLettersFromString() {
		String str = "pavan kumar";

		String[] split2 = str.split(" ");

		for (String string : split2) {
			StringBuilder string2 = new StringBuilder(string).reverse();
//			System.out.println(string2);
		}

		char[] charArray = str.toCharArray();

		String input = "Hello World Java Programming";

		// Using Java 8 Streams to reverse each word
		String result = Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString()) // Reverse
//				.collect(Collectors.toList());																								// each
				// word
				.collect(Collectors.joining(" ")); // Join the reversed words with space

		// Print the result
		System.out.println(result);

//		
//		
//		//o/p: navap ramuk;
//		
//		String[] split = str.split("\\ ");
////		System.out.println(split[0]);
//		
//		char[] charArray2 = (split[0].toCharArray());
//		String[] stringArray = new String[charArray2.length];
////		for (int i = charArray2.length-1; i > -1; i--) {
////			stringArray[i] = Character.toString(charArray2[i]);
////			System.out.println(Character.toString(charArray2[i]));
////		}
////		for (int i = 0; i < charArray2.length; i++) {
////			System.out.println(Character.toString(charArray2[i]));
////		}
////		for (char c : charArray2) {
////			
////			System.out.println(Character.toString(c));
////		}
////		 string = charArray2.toString();
////		System.out.println(string);
//		
//		
//		ArrayList<String> arrayList = new ArrayList<>();
//		
//		Collections.sort(arrayList, Collections.reverseOrder());
	}

	public void executeLengthOfEachWord(List<String> courses) {
		// Using Map function but not recommended
//		courses.stream()
//		.map(val -> {
//			System.out.println("Length of " + val + "is - " + val.length());
//			return val;
//		}).collect(Collectors.toList());

		courses.stream().forEach(val -> {
			System.out.println("Length of " + val + "is : " + val.length());
		});
	}

	public void executeTestCode() {
		// 5, 10, 4, 3, 11, 15, 3
		// sorted array {3,3,4,5,10,11,15}
		// {3,3,4,5}
		// Iterate through list and add

//				List<Integer> asList = Arrays.asList(3,3,4,5,10,11,15);

		/*
		 * List<String> asList = Arrays.asList("5", "1", "10", "4");
		 * asList.stream().map(n -> Integer.parseInt(n)).sorted((b, a) -> b -
		 * a).forEach(System.out::println);
		 */
//				

//				Collections.sort();
//				System.out.println(mapToInt);

//				Stream<String> sorted = asList.stream().mapToInt();

//				forEach((number) -> {
//					System.out.println(number);
//				});
//				

//				Collections.sort(Integer.parseInt(asList));

//				System.out.println(asList);

//				asList.stream().map()

		// {3,3,4,5}{10,11}{15} - // Highest number of balls in a single bucket is - 4

		// 3 ->
	}

}
