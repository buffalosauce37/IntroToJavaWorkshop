package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot r2d2= new Robot();
	
r2d2.penDown();
		
r2d2.setSpeed(10);
	
r2d2.setRandomPenColor();
		
int x=3;
		
int y=120;
		
for (int i = 0; i < 200; i++) {
	r2d2.move(i);
	

	
r2d2.turn(y+1);
	// 11. Turn the robot one more degree

}
			
	
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}