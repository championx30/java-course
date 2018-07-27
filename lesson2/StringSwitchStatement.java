package lesson2;

import java.util.Calendar;
import java.util.Locale;

public class StringSwitchStatement {

	static String getTypeOfDay(Calendar calendar) {
		String type = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("vi"));
		switch (type) {
		case "Th 2":
			return "Start of work week";
		case "Th 3":
			return "Tuesday";
		case "Th 4":
			return "Mid week";
		case "Th 5":
			return "Thursday";
		case "Th 6":
			return "End of work week";
		case "Th 7":
			return "Saturday";
		case "CN":
			return "Weekend";
		}
		return "Unknown";
	}

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Today is " + getTypeOfDay(calendar));
		calendar.set(Calendar.DATE, 0);
		System.out.println("Tomorow is " + getTypeOfDay(calendar));
	}

}
