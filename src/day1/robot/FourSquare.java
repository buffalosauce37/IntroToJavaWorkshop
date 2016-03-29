package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	
	Robot r2d2=new Robot();
	void go() {
		
r2d2.setSpeed(100);
		// 5. Set the pen width to 5
r2d2.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	for (int i = 0; i < 4; i++) {
		r2d2.setRandomPenColor();
		r2d2.turn(90);
		drawSquare();
	}
		
	
			

	}


	void drawSquare() {
for (int i = 0; i < 4; i++) {
	r2d2.penDown();
	r2d2.move(300);
	r2d2.turn(90);
}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
