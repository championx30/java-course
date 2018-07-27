package lesson4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.awt.AwtExample1;

public class ShowExampleActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		AwtExample1 screen = new AwtExample1();
		screen.setSize(500,200);
		screen.setVisible(true);
		screen.addWindowListener(new WindowAdapter(){
			public void windownClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
	

}
