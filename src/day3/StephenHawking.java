package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {
		String talk = "";
		
			String words = JOptionPane.showInputDialog("write something");
			speak(words);
		
		if (words.equalsIgnoreCase("sup")) {
			JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");

			String adj = JOptionPane.showInputDialog("Enter a adjective.");

			String liq = JOptionPane.showInputDialog("Enter a liquid.");

			String bod = JOptionPane.showInputDialog("Enter a body part");

			String ver = JOptionPane.showInputDialog("Enter a verb");

			String pla = JOptionPane.showInputDialog("Enter a place");

			String Mad = ("Piranhas are more " + adj + " during the day, so cross the river at night. Piranhas are attracted to fresh " + liq
					+ " and will most likely take a bite out of your " + bod + " if you " + ver
					+ ". Whatever you do, if you have an open wound, try to find another way to get back to the " + pla + ".Good luck");

			JOptionPane.showMessageDialog(null, Mad);
			speak(Mad);
		}
	}

	// 3. call the speak method below and send it the sentence
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
