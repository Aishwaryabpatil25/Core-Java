package com.xworkz.typesrunner;

import com.xworkz.differenttypesinfc.Cab;

public class CabRunner 
  {

	public static void main(String[] args) 
	{

	Cab cab = (source,destination)->System.out.println("ola cab is booked from "+source+" To "+destination);
	cab.bookCab("mysore", "hubli");  	
				
	}
}
