package com.xworkz.interfacemetro;

public interface MetroRules {

	String GREEN_LINE = "green";
	String PURPUL_LINE = "purpul";
	String YELLOW_LINE = "yellow";

	int buyTicket();

	boolean excessLuagage();

	boolean cleaniness();

	String getLine();
}
