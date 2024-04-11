package com.xworkz.typesrunner;

public class ShapesRunner 
{

	public static void main(String[] args)
	{
		  ShapesArea Rarea = (length, width) -> 
		    {
	            double area = length * width;
	            System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);
	            return area;
	        };

	        double area = Rarea.calculateArea(5.0,10.0);
	        System.out.println("Area returned: " + area);

	}	

}
