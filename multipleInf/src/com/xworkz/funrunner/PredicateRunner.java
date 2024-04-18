package com.xworkz.funrunner;

import com.xworkz.fun.Predicate;
import com.xworkz.funass.PredicateAss;

public class PredicateRunner
    {
	    public static void main(String[] args)
	    {
	      
	        Predicate<Integer> isPositive = num -> num > 0;
	        boolean result = PredicateAss.receivePredicate(isPositive, 10);
	        System.out.println("Result: " + result);
	    }
	}


