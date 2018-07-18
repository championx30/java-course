package lesson2;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamArrayExample2 {

	public static void main(String[] args) {
		Integer[] values = { 2, 4, 5, 6, 1, 4, 5, 11, 3 };
		Stream<Integer> stream = Arrays.stream(values);
		Optional<Integer> max = stream.max((Integer o1, Integer o2)->{
			return o1-o2;
		});
		System.out.println("Gia tri lon nhat: "+max.get());
//		Predicate<Integer> predicate = values->values.intValue()>5;
		
	}
}
