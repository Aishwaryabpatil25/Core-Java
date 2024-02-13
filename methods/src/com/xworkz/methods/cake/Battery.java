package com.xworkz.methods.cake;

public class Battery {

	public int capacity;
	public int voltage;
	public String reusability;
	
	public Battery()
	{
		System.out.println("no param for battery");
	}
	
	@Override
	public String toString() {
		System.out.println("capacity:"+capacity+"\t"+"voltage:"+voltage+"\t"+"reusability:"+reusability); 
		return super.toString();
}
}