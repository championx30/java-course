package lesson1;

class StringExample3 {
	public static void main(String[] args) {
		String text = "Absolute Value";
		byte[] bytes = text.getBytes();
		System.out.println("Byte values are");
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i] + ", ");
		}
		System.out.println("String values are " + new String(bytes));
	}
}