package lesson1;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.MessageFormat;

class MessageFormatExample {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM y");
		String message = MessageFormat.format("Hello {0}! Today is {1}.", args[0],
				dateFormat.format(Calendar.getInstance().getTime()));
		System.out.println(message);
	}
}