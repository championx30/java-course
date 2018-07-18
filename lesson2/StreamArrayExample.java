package lesson2;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamArrayExample {

	public static void main(String[] args) {
		Integer[] values = { 2, 4, 7, 1, 3, 5, 9, 11, 3 };
		Arrays.sort(values, (Integer o1, Integer o2)->{
			return o2 - o1;
		});
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println("========");
		Stream<Integer> stream = Arrays.stream(values);
		stream.forEach(value->System.out.println(value));
		Consumer<Integer> c = (Integer value)->{System.out.println(value);};
		stream.forEach(c);
	}
}
