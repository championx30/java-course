package lesson1;

class MathExample {
	public static void main(String[] args) {
		int i = 4;
		int j = -8;
		double x = 47.1;
		double y = 1.79;
		System.out.println("|" + j + "| is " + Math.abs(j));
		System.out.println("|" + x + "| is " + Math.abs(x));
		System.out.println(y + " is approximately " + Math.round(y));
		System.out.println("The ceiling of " + x + " is " + Math.ceil(x));
		System.out.println("The floor of " + x + " is " + Math.floor(x));
		System.out.println("min(" + x + "," + y + ") is " + Math.min(x, y));

		System.out.println("Pi is " + Math.PI);
		double angle = 45.0 * 2.0 * Math.PI / 360;
		System.out.println("cos(" + angle + ") is " + Math.cos(angle));

		double value = 0.707;

		System.out.println("acos(" + value + ") is " + Math.acos(value));
		System.out.println("acos(" + value + ") is " + Math.acos(value));
		System.out.println("acos(" + value + ") is " + Math.acos(value));

	}
}
