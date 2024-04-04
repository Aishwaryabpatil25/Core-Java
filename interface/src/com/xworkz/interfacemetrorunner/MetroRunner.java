package com.xworkz.interfacemetrorunner;

import com.xworkz.interfacemetro.BanashankariMetroRulesImpl;
import com.xworkz.interfacemetro.MetroRules;
import com.xworkz.interfacemetroadmin.MetroAdmin;

public class MetroRunner {

public static void main(String[] args) {
	
	MetroRules m = new BanashankariMetroRulesImpl();
	m.cleaniness();
	
	BanashankariMetroRulesImpl b = new BanashankariMetroRulesImpl();
	b.excessLuagage();

	Object obj = new BanashankariMetroRulesImpl();
	obj.getClass();
	
	
     MetroAdmin ma=new MetroAdmin(m);
     ma.MetroAdmin();
     
     MetroRules m1=new BanashankariMetroRulesImpl();
     m1.getLine();
    
  }
		
	
}
