package com.xworkz.methods.cake;

public class SwitchBoard {

	public int capacity;
	public int volt;
	public String brand;
	
	public SwitchBoard()
	{
		System.out.println("no param for switch");
	}
	
	public SwitchBoard(int capacity,int volt,String brand)
	{
		this.capacity=capacity;
		this.volt=volt;
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		System.out.println("tostring for switchboard");
		return "capacity:"+capacity+"\t"+"volt:"+volt+"\t"+"brand:"+brand;
		
	}
}
