package com.xworkz.methods.cake;

public class Ring {

	public String type;
	public int price;
	public String stoneType;
	
	
	public Ring()
	{
		System.out.println("no param for ring");
	}
	
	public void Commitment()
	{
		
		super.toString();
		System.out.println("this for commitment");
	}
	
	@Override
	public String toString() 
	{
		System.out.println("this is tostring for ring");
		return "type:"+type+"\t"+"price:"+price+"\t"+"stoneType"+stoneType;
		
	}
}

