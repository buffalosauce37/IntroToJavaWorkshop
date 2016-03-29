package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			String words=JOptionPane.showInputDialog("write something");
			speak(words);
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
