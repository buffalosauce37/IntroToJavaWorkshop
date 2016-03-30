package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

	
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		
 String adj=JOptionPane.showInputDialog("Enter a adjective.");
		
String liq=JOptionPane.showInputDialog("Enter a liquid.");
		
String bod=JOptionPane.showInputDialog("Enter a body part");
		
String ver=JOptionPane.showInputDialog("Enter a verb");
		
String pla=JOptionPane.showInputDialog("Enter a place");
		
 String Mad=("Piranhas are more "+adj + " during the day, so cross the river at night. Piranhas are attracted to fresh "+liq+" and will most likely take a bite out of your "+bod+ " if you "+ver+". Whatever you do, if you have an open wound, try to find another way to get back to the "+pla+ ".Good luck");
		
		JOptionPane.showMessageDialog(null, Mad);

	}
}

