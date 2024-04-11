package com.xworkz.typesrunner;

import com.xworkz.differenttypesinfc.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		
		Chocolate choco=()->System.out.println("Running eat method in choco");
        choco.eat();
	}

}
