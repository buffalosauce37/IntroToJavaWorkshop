package day3;


	// Copyright Wintriss Technical Schools 2013
	import java.util.Random;

import javax.swing.JOptionPane;

	public class magic_8_ball {


public static void main(String[] args) {
	int magic=new Random().nextInt(4);
	System.out.println(magic);
	JOptionPane.showInputDialog("Enter Question");
	if (magic==0) { JOptionPane.showMessageDialog(null, "yes");}
	if (magic==1) { JOptionPane.showMessageDialog(null, "no");}
	if (magic==2) { JOptionPane.showMessageDialog(null, "you should ask google");}
	if (magic==3) { JOptionPane.showMessageDialog(null, "Error 45 manuel shutdown in progress.");}
}
		


	
		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer

	}



