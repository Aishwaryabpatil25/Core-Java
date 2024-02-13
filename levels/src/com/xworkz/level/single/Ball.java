package com.xworkz.level.single;

public class Ball {

	public void runBall(Object object)
	{
		if(object instanceof Pen)
		{
			Pen pen = (Pen)object;
			System.out.println(pen.price);
			pen.write();
		}
	    if(object instanceof InkPen)
	    {
	    	InkPen inkPen =(InkPen)object;
	    	System.out.println(inkPen.inkColor);
	    	inkPen.noteTaking();
	    
	    
	    }
	
	}
}
