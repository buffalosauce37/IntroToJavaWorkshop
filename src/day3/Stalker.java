package day3;

import javax.swing.JOptionPane;

public class Stalker {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What is your name?");
	String address=JOptionPane.showInputDialog("What is you full address?");
	String email=JOptionPane.showInputDialog("what is you email password?");
	JOptionPane.showMessageDialog(null, "Hello "+name+"I know where you live it is, "+address+"I can read your private email your password is, "+email );
}
}
