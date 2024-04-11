package com.xworkz.interfacemetroadmin;

import com.xworkz.interfacemetro.SamsungFreezer;

public class SamsungFreezerAdmin {

	private SamsungFreezer sam;
	
	public SamsungFreezerAdmin(SamsungFreezer sam)
	{
		this.sam=sam;
	}
	public void autoCool()
	{
		if(sam!=null)
		{
			System.out.println("this is Samsung Freezer autocool method");
		}
		else
		{
			System.err.println("this is not samsung autocool method");
		}
	}

    public void iceMaker()
    {
    	if(sam!=null)
    	{
    		System.out.println("this is icemaker in SamFreezer");
    	}
    	else
    	{
    		System.err.println("this is not samsung icemaker method");
    	}
    }
}


