package com.xworkz.funrunner;

import com.xworkz.fun.FunctionInterface;
import com.xworkz.funass.FunctionAssociation;

public class FunctionRunner 
{
    public static void main(String[] args) 
    {
        
        FunctionInterface<String, Integer> function = s -> s.length();
        int result = FunctionAssociation.processFunction(function, "Hello");
        System.out.println("Result: " + result);
    }
}

