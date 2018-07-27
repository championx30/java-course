package lesson4;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.awt.AwtExample1;

public class AwtExampleTest1 {

	public static void main(String[] args) {
		AwtExample1 screen = new AwtExample1();
		screen.setSize(500, 700);
		screen.setVisible(true);
		screen.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}
