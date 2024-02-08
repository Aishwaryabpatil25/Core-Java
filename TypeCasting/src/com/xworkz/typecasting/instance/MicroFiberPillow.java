package com.xworkz.typecasting.instance;

public class MicroFiberPillow extends Pillow{

	public String pattern="floral";
	
	public MicroFiberPillow()
	{
		System.out.println("no parm for microfiberpillow");
	}
	
	public void comfort()
	{
		System.out.println("comfort for microfiberpillow");
	}
	@Override
	public void support()
	{
		System.out.println("support for micro");
	}
}
