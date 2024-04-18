package com.xworkz.funrunner;

import com.xworkz.fun.LongPredicate;
import com.xworkz.funass.LongPredicateAssociation;

public class LongRunner 
{
    public static void main(String[] args) 
    {
        
        LongPredicate longPredicate = num -> num % 2 == 0;
        boolean result = LongPredicateAssociation.calculateLongPredicate(longPredicate, 10);
        System.out.println("Result: " + result);
    }
}
