package com.xworkz.interfacemetrorunner;

import com.xworkz.interfacemetro.Freezer;
import com.xworkz.interfacemetro.HawaiFreezerRulesImpl;
import com.xworkz.interfacemetro.LgFreezer;
import com.xworkz.interfacemetro.SamsungFreezer;
import com.xworkz.interfacemetroadmin.LgFreezerAdmin;
import com.xworkz.interfacemetroadmin.SamsungFreezerAdmin;


public class FreezerRunner 
{
 public static void main(String[] args) 
 {
	
	 Freezer fz= new HawaiFreezerRulesImpl();
//	 fz.autoCool();
	 
	 LgFreezer la = new HawaiFreezerRulesImpl();
//     la.autoCool();
	 
     
	 LgFreezerAdmin lgAdmin = new LgFreezerAdmin(la);
	 lgAdmin.autoCool();
	 lgAdmin.stroingFoods();
	 
	 
	 
	 SamsungFreezer sam= new HawaiFreezerRulesImpl();
//	 sam.autoCool();
	 
	 
	 SamsungFreezerAdmin samAdmin = new SamsungFreezerAdmin(sam);
	 samAdmin.autoCool();
	 samAdmin.iceMaker();
	 
		
		
 }
	
	
}
