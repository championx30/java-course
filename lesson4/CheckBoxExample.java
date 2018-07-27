package lesson4;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

public class CheckBoxExample extends Frame{
	
	public CheckBoxExample(){
		setLayout(new FlowLayout());
		Checkbox checkbox1 = new Checkbox("Lựa chọn 1");
		checkbox1.setFont(new Font("Arial",Font.BOLD,14));
		add(checkbox1);
		Checkbox checkbox2 = new Checkbox("Checkbox 2");
		add(checkbox2);
		checkbox2.addItemListener(e->{
			System.out.println("Value 2 = "+checkbox2.getState()); 
		});
	}
}
