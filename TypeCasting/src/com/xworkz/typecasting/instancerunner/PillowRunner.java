package com.xworkz.typecasting.instancerunner;

import com.xworkz.typecasting.instance.AirPillow;
import com.xworkz.typecasting.instance.Blanket;
import com.xworkz.typecasting.instance.MicroFiberPillow;
import com.xworkz.typecasting.instance.Pillow;

public class PillowRunner 
   {

	public static void main(String[] args) 
	 {
		
		Blanket blanket = new Blanket();
		
	    Pillow pillow = new Pillow();
        blanket.runPillow(pillow);
	    
	    Pillow pillow1 = new MicroFiberPillow();
	    blanket.runPillow(pillow1);
	    
	    Pillow pillow2 = new AirPillow();
	    blanket.runPillow(pillow2);
	
	  }
	    
   }

