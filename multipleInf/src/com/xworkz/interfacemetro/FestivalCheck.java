package com.xworkz.interfacemetro;

import com.xworkz.differenttypesinfc.Festival;

public class FestivalCheck {

	private Festival festival;
	
	public FestivalCheck(Festival festival)
	{
		this.festival=festival;
	}
	
	public void check()
	{
		System.out.println("Ruuning festival class in check method");
		boolean value=this.festival.prepare("sweet", "flower");
		if(value)
		{
			System.out.println("Item is prepared");
		}
		else {
			System.out.println("Item is not Prepared");
		}
	}
}
