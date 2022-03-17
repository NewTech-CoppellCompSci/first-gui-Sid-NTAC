package lab;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Runner {
	
	frame.add(button1);
	
	
	//create picture object
	ImageIcon pic1 = new ImageIcon("src/GUIS/N3ON.png");
	//scale picture object
	ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH));
	
	//label with original picture
	JButton label3 = new JButton(pic1);
	label3.setBounds(20, 350, 
			pic1.getIconWidth(), 
			pic1.getIconHeight());
	frame.add(label3);
	
	
	//label with scaled picture
	JLabel label4 = new JLabel(scaledPic1);
	label4.setBounds(500, 350, 
			scaledPic1.getIconWidth(), 
			scaledPic1.getIconHeight());
	frame.add(label4);
	
	//don't use a layout
	frame.setLayout(null);
	
	//Build the frame
	frame.setVisible(true);

}



