package lesson2;

public class Lambda {
	public interface Comparator{
		public boolean compare(int number, int number2);
		
	}

	public static void main(String[] args) {
		Comparator comparator = (number1, number2)->number1>number2;
		boolean result = comparator.compare(1, 2);
		System.out.println(result);
	}
}
