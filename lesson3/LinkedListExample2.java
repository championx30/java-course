package lesson3;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(Arrays.asList(args));
		list.forEach(value -> {
			System.out.println(value);
		});
	}
}
