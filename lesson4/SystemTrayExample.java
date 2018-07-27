package lesson4;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class SystemTrayExample {
	public static void main(String[] args) {
		SystemTray tray = SystemTray.getSystemTray();
		Icon icon = UIManager.getIcon("Option.informationIcon");
		Image image = ((ImageIcon) icon).getImage();
		TrayIcon trayIcon = new TrayIcon(image,	"TrayDemo", null);
		trayIcon.addActionListener(new ShowExampleActionListener());
		try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
