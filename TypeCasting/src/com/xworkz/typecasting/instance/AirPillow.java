package com.xworkz.typecasting.instance;

public class AirPillow extends Pillow {

	public String shape="square";
	
	public AirPillow()
	{
		super();
		System.out.println("no parm for airpillow");
	}
	
	public void rest()
	{
		System.out.println("rest for airpillow");
	}
}
