package com.xworkz.interfacemetroadmin;

import com.xworkz.interfacemetro.MetroRules;

public class MetroAdmin {

	private MetroRules metroRules;

	
	
	public MetroAdmin(MetroRules metroRules)
	{
		this.metroRules=metroRules;
	}
	
	public void MetroAdmin()
	{
		if(metroRules!=null)
		{
			if(metroRules.cleaniness() && metroRules.excessLuagage())
			{
			System.out.println("metro rules is good");
		}
			else
			{
				System.out.println("metro rules is not good");
			}
	}
	}
}
