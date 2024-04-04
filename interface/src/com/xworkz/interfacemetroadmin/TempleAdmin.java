package com.xworkz.interfacemetroadmin;

import com.xworkz.interfacemetro.TempleRules;

public class TempleAdmin {

	private TempleRules templeRules;
	
	public TempleAdmin(TempleRules templeRules)
	{
		this.templeRules=templeRules;
	}
	
	public void openTime()
	{
		if(templeRules!=null)
		{
			double ot = templeRules.openTime(); 
			System.out.println("Open time: " + ot); 
		}
		else
		{
			System.out.println("Temple rules not followed by open time");
		}
	}
	
	public void closeTime()
	{
		if(templeRules!=null)
		{
			double ct = templeRules.closeTime();
			System.out.println("close Time:"+ct);
		}
		else
		{
			System.out.println("temple rules not followed by close time");
		}
	}
	public void specialEntry()
	{
		if(templeRules!=null) {
		double se = templeRules.specialEntry();
		System.out.println("special entry:"+se);
	}
	else
	{
		System.out.println("temple rules not followed by special entry");
	}
	}
}
