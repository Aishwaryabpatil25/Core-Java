package com.xworkz.inheritanceobject.chocolate;

public class Orange extends Fruit{

	public float netQuantity=0.55f;
	
	public Orange()
	{
		System.out.println("no param orange");
	}
	public void provideVitamin()
	{
		System.out.println("this provides vitamin");
	}
}
