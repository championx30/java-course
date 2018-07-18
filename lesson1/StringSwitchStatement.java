package lesson1;

import java.util.Calendar;
import java.util.Locale;

public class StringSwitchStatement {

	String getTypeOfDay(Calendar calendar) {
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
		StringSwitchStatement statement = new StringSwitchStatement();
		Calendar calendar = Calendar.getInstance();

		System.out.println("Today is " + statement.getTypeOfDay(calendar));

	}

}
