package com.xworkz.methods.cake;

public class Paint {

	public String brand;
	public String color;
	public int price;
	
	public Paint()
	{
		System.out.println("no param for paint");
	}
	
	public void decoration()
	{
		super.toString();
		System.out.println("this for decoration");
	}
	@Override
	public String toString() {
		
		 super.toString();
		 System.out.println("this is tostring for  Paint");
		 System.out.println("brand:"+brand+"\t"+"color:"+color+"\t"+"price:"+price); 
		 return super.toString();
	}
}
