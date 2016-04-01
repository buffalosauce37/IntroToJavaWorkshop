package day5;

import java.applet.AudioClip;
import java.awt.AWTException;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 600;
	final int frameHeight = 400;

	ScaryMaze() throws Exception {
		
		maze = ImageIO.read(getClass().getResource("maze7.jpg"));
	
		new Robot().mouseMove(26, 95);
		
	
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		
System.out.println(mouseColor);
		
int x=(-1);
	
		if(mouseColor==x){
			scare();
			}
		int z=(-63744);
		if(mouseColor==z){
			try {
				new Robot().mouseMove(26, 95);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		//10. if the mouse is on the end color
				int y=(-9175296);
				// pop up a message to tell them they won
		if (mouseColor==y){
			JOptionPane.showMessageDialog(null, "good job");
		}
	}

	private void scare() {
		System.out.println("BOO!");
		//7. find a scary sound and put it in the day5 package where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("61034__timtube__scream-4.wav"));
		
		//8. play the scary sound. Hint: type "sound" and then a period.		
		sound.play();
		//9. drop an image into your day5 package, and use the showScaryImage method to scare your victim!
showScaryImage("scary.jpg");
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



