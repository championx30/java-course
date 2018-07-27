package lesson1;

class MethodExample {
	private static int add(int... values) {
		int total = 0;
		for (int i : values) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println("Total: " + add(4, 7, 5, 12, 6, 9));
	}
}
