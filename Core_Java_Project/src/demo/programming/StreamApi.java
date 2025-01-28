package demo.programming;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

	public void executeSortingGivenElements() {
		List<Integer> lst = List.of(1,2,3,4,5,6,7,8);
		
		lst.stream()
		.filter(n -> n%2==0) // 2,4,6,8
		.map((n) -> n*n);
//		.collect(Collectors.toList());
//		System.out.println(collect); // 4,16,36,64
//		.forEach(System.out::println);
		
//		range.forEach(System.out::println);
//		System.out.println("intstream" + range);
		
		 List<String> lst1 = List.of("5","3","0","1","6", "0", "asd", "12", "05");
		 List<Integer> collect = lst1.stream()
		 .filter((n) -> {
			 try {
				 Integer.parseInt(n); 
				 return true;
				
			} catch (Exception e) {
				return false;
			}
			 
		 })
		 .map(n -> Integer.parseInt(n))
		 .sorted()
		 .collect(Collectors.toList());
		 
		 
		 System.out.println(collect);
		 
		 List<Integer> lst2 = List.of(3,3,4,5,7,9,12,15,16,18);
//		 .collect();
//		 .forEach(System.out::print);
		 
//		 .sorted();
//		 IntStream sorted2 = sorted.sorted();
//		 .max((a,b)->b-a);
//		 sorted2.forEach(System.out::println);
//		 .filter(n->{Integer.parseInt(n);});
		 
	}
}
