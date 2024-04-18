package com.xworkz.funrunner;

import com.xworkz.fun.BooleanSupplier;
import com.xworkz.funass.BooleanSuppAss;

public class BooleanSuppRunner 
    {

	    public static void main(String[] args) 
	      {
	        
	        BooleanSupplier randomBooleanSupplier = () -> Math.random() > 0.5;
	        boolean result = BooleanSuppAss.RunBooleanSupplier(randomBooleanSupplier);
	        System.out.println("Result: " + result);
	    }
	}


