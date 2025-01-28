package demo.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class FP01Functional {

	public void run() {

//		printEvenNumbersInFunctional(List.of(3, 1, 2, 9, 12, 7, 1, 3, 10));
		HashMap<Object, Object> hashMap = new HashMap<>();
		Set<Entry<Object, Object>> entrySet = hashMap.entrySet();

		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();

		iterator.hasNext();
		iterator.next();
	}

	public void printEvenNumbersInFunctional(List<Integer> numbers) {
		// What to do?
		Stream<Integer> distinct = numbers.stream()
				// filter - allow only even number
				.filter(number -> number % 2 == 0).distinct();

//			long count = distinct.reduce(11, (a,b)-> {
//				System.out.println("a :" +a + "b :" + b);
//				return a > b ? a : b;
//				
//			});
//			System.out.println(count);

//			distinct.forEach(System.out::println);
		// Method reference

	}
}
