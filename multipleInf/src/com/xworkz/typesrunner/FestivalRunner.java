package com.xworkz.typesrunner;

import com.xworkz.interfacemetro.FestivalCheck;

public class FestivalRunner {

	public static void main(String[] args) {
		
		FestivalCheck check= new FestivalCheck((item,buy)->true);
		check.check();
		
		System.out.println("This is main Method");

	}

}
