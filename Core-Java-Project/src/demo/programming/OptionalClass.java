package demo.programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {
public void executePredicateOnList() {
	List<String> fruits = List.of("apple", "banana", "orange");
	
	Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
	Optional<String> optional = fruits.stream().filter(predicate).findFirst();
	
	System.out.println(optional);
	System.out.println(Optional.empty());
	
}

}
