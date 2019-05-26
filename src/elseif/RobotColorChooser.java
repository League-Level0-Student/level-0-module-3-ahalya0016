//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new	 Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(50);
		rob.penDown();
		for (int i = 0; i < 4; i++) {
			rob.move(200);
			rob.turn(90);
		}
		// 3. Ask the user what color they would like the robot to draw
		for (int s = 0; s < 3000; s++) {
			String x = JOptionPane.showInputDialog("What color would you like the robot to draw?");
			// 4. Set the pen width to 10
			rob.setPenWidth(10);
			// 5. Use an if/else statement to set the pen color that the user requested
			if (x.equals("red")) {
				rob.setPenColor(500, 000, 000);
				rob.setSpeed(100);
				rob.penDown();

				for (int i = 0; i < 4; i++) {
					rob.move(200);
					rob.turn(90);
				}

			}
			if (x.equals("blue")) {
				rob.setPenColor(000, 000, 500);
				rob.setSpeed(100);
				rob.penDown();

				for (int i = 0; i < 4; i++) {
					rob.move(200);
					rob.turn(90);
				}
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				rob.setRandomPenColor();
				rob.setSpeed(100);
				rob.penDown();

				for (int i = 0; i < 4; i++) {
					rob.move(200);
					rob.turn(90);
				}
			}
		}
	}

}

// 7. Put a loop around your code so that you keep asking the user for more
// colors & drawing them
