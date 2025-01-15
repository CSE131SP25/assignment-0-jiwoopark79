package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
	
	    robot.forward(15); // Move forward
	    robot.turnRight(45);  // Turn right by 45 degrees
	    robot.forward(50);  // Draw the first part of the petal
	    robot.turnLeft(90);  // Turn left by 90 degrees
	    robot.forward(50);  // Draw the second part of the petal
	     // Turn back to the initial position
	    robot.turnLeft (95);
	    robot.forward(50); 
	    robot.turnRight(90); 
	    
	    robot.forward(-75); // Move back to the starting position
	   
		
	}

}
