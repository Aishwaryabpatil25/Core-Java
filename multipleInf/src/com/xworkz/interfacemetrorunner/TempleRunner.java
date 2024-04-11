package com.xworkz.interfacemetrorunner;

import com.xworkz.interfacemetro.ShivaTempleRulesImpl;
import com.xworkz.interfacemetro.TempleRules;
import com.xworkz.interfacemetroadmin.TempleAdmin;

public class TempleRunner {

	public static void main(String[] args) {
		
	
		
	
		
		 TempleRules shivaTemple = new ShivaTempleRulesImpl(); 
		 
	     TempleAdmin templeAdmin = new TempleAdmin(shivaTemple);

	       templeAdmin.openTime();
		   templeAdmin.closeTime();
		   templeAdmin.specialEntry();
			
	}
}
