package com.xworkz.interfacemetro;

public class BanashankariMetroRulesImpl  implements MetroRules{

	@Override
	public int buyTicket() {
		System.out.println("running metro rules in buyticket method");
		return 10;
	}

	@Override
	public boolean excessLuagage() {
		System.out.println("running metro rules in excess luagage method");
		return true;
	}

	@Override
	public boolean cleaniness() {
		System.out.println("running metro rules in cleaniness method");
		return true;
	}

	@Override
	public String getLine() {
		System.out.println("running metro rules in getline method");
		return  MetroRules.YELLOW_LINE;
	}

}
