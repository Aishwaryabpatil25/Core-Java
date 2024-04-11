package com.xworkz.typesrunner;

import com.xworkz.differenttypesinfc.Dress;

public class DressRunner {

	public static void main(String[] args) {
		 Dress dress = (color) -> {
	            
	            boolean isSuitable = color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("black");
	            System.out.println("Is the dress suitable for the event " + isSuitable);
	            return isSuitable;
	        };

	        boolean suitable = dress.isSuitableForEvent("blue");
	        System.out.println("Is the dress suitable " + suitable);

	}

}
