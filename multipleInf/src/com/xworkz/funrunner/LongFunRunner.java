package com.xworkz.funrunner;

import com.xworkz.fun.LongFun;
import com.xworkz.funass.LongFunAss;

public class LongFunRunner 
{
    public static void main(String[] args) 
    {
        
        LongFun<String> longFunction = num -> "The number is: " + num;
        String result = LongFunAss.printLongFunction(longFunction, 100L);
        System.out.println("Result: " + result);
    }
}

