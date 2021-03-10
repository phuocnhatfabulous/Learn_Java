
import java.awt.Color;
import javax.swing.JFrame; //Declare java frame library 
import javax.swing.ImageIcon;

public class frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //Create a frame
		frame.setTitle("JFrame title goes here "); //Set title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); //Exit out of application
		frame.setResizable(false); //Prevent frame from being resize
		frame.setSize(420,420); //Sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //Make frame visible
		
		ImageIcon image = new ImageIcon("bame.png"); //Create an image
		frame.setIconImage(image.getImage()); //Change icon frame
		frame.setContentPane().setBackground(new Color(0,0,6)); //Change color of background
		
		
	}

}
