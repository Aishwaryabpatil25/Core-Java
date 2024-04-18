package com.xworkz.funrunner;

import com.xworkz.fun.Unary;
import com.xworkz.funass.UnaryAssociation;

public class UnaryRunner 
{
    public static void main(String[] args) 
    {
       
        Unary<Integer> unary = num -> num * 2;
        int result = UnaryAssociation.executeUnary(unary, 5);
        System.out.println("Result: " + result);
    }
}