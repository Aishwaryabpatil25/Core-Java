package com.xworkz.interfacemetroadmin;



import com.xworkz.interfacemetro.LgFreezer;

public class LgFreezerAdmin {

	private LgFreezer lg;
	
	public LgFreezerAdmin(LgFreezer lg)
	{
		this.lg=lg;
	}
	
	public void autoCool()
	{
		if(lg!=null)
		{
			
			System.out.println("this is Lgfreezer auto cool method");
			
		}
		else
		{
			System.err.println("this is LgFreezer not auto cool method");
		}
	}
    public void stroingFoods()
    {
    	if(lg!=null)
    	{
    		System.out.println("this is stroingFood in lgFreezer");
    	}
    	else
    	{
    		System.err.println("this is lgFreezer not stroingfood");
    	}
    }

}


