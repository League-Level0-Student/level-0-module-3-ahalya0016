import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(1000);
String x = JOptionPane.showInputDialog("Would you like the robot to draw a square, triangle, or circle?");
if (x.equals ("square")) {
	drawSquare (rob); }
if (x.equals("triangle"))  {
	drawTriangle (rob);
}
if (x.equals("circle")) {
drawCircle (rob);
} }
static void  drawSquare(Robot rob) {
	for (int i = 0; i < 4; i++) {
		rob.move(150);
		rob.turn(90);
	} }
static void drawTriangle (Robot rob) {
	for (int i =  0; i < 3; i++) {
	rob.turn(60);
	rob.move(150);
	rob.turn(60);
}


}
{ }
static void drawCircle (Robot rob) {
	for (int i = 0; i < 10000; i++) {
	rob.move(1);
	rob.turn(1);
	
}
}
}