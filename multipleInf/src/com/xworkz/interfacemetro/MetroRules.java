package com.xworkz.interfacemetro;

public interface MetroRules {

	String GREEN_LINE = "green";
	String PURPUL_LINE = "purpul";
	String YELLOW_LINE = "yellow";

	int buyTicket();

	boolean excessLuagage();

	boolean cleaniness();

	String getLine();
	
	
//	Different types of interface in that default type is also one
	
	default void getTicket()
	{
		System.out.println("this is default method for metro");
	}
}
