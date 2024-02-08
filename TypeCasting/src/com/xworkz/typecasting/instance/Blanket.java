package com.xworkz.typecasting.instance;

public class Blanket 
  {	
	public void runPillow(Pillow pillow)
	{
		System.out.println(pillow.material);
		pillow.support();
		
		
		if(pillow instanceof MicroFiberPillow)
		{
			MicroFiberPillow microFiberPillow =(MicroFiberPillow)pillow;
			System.out.println(microFiberPillow.pattern);
			microFiberPillow.comfort();
		}
			if(pillow instanceof AirPillow)
			{
				 AirPillow  airPillow =(AirPillow)pillow;
				 System.out.println(airPillow.shape);
				 airPillow.rest();
			}
		}
	}

