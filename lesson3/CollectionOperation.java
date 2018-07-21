package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperation {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(4, 7, 1, 3, 8, 9, 2, 6, 10));
		Comparator<Integer> comparator = Integer::compare;
		Collections.sort(listOfIntegers, comparator);
		listOfIntegers.forEach(value -> System.out.print(value + ", "));

		System.out.println();
		listOfIntegers.stream().filter(v -> v > 5).forEach(v -> System.out.print(v + ", "));

		Integer[] values = listOfIntegers.stream().filter(v -> v > 5).toArray(size -> new Integer[size]);
		System.out.println();
		Arrays.stream(values).forEach(v -> System.out.print(v + "; "));

		Collector<Integer, ?, IntSummaryStatistics> collector = Collectors.summarizingInt(Integer::intValue);
		IntSummaryStatistics summaryStatistics = listOfIntegers.stream().collect(collector);
		System.out.println("\ntotal = " + summaryStatistics.getSum());
		System.out.println("overage = " + summaryStatistics.getAverage());
		int sum = listOfIntegers.stream().reduce(0, (x, y) -> x + y);
		// int sum = listOfIntegers.stream().reduce(0,Integer::sum);
		System.out.println(sum);

		Consumer<Integer> myConsumer = n -> {
			System.out.println("User input value = " + n);
			if (n < 5) {
				System.out.println("Invalid value!");
				return;
			}
			listOfIntegers.add(n);
			System.out.print("Value: ");
			listOfIntegers.forEach(x -> System.out.print(x + " - "));
		};
		myConsumer.accept(12);

		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			System.out.print("\nPlease input a number: ");
//			int value = scanner.nextInt();
//			myConsumer.accept(value);
//			System.out.println();
//		}

		Consumer<Integer> myConsumer2 = n -> listOfIntegers.add(n);
		Predicate<Integer> tester = v -> v > 5;
		
		while (true) {
			System.out.print("\nPlease input a number: ");
			int value = scanner.nextInt();
			
			if (value < 0)
				break;
			if (tester.test(value))
				myConsumer2.accept(value);
		}
		listOfIntegers.forEach(x -> System.out.println(x + " - "));
		scanner.close();
	}
}
