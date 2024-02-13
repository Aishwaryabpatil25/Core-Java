package com.xworkz.level.singlerunner;

import com.xworkz.level.single.Ball;
import com.xworkz.level.single.InkPen;
import com.xworkz.level.single.Pen;

public class PenRunner {

	public static void main(String[] args) {
		
	Object object = new Object();
	
	Ball ball = new Ball();
	ball.runBall(object);
	
	Object obj1= new Pen();
	ball.runBall(obj1);
	
	Object obj2 = new InkPen();
	ball.runBall(obj2);
	
	
	
	
	}
}
