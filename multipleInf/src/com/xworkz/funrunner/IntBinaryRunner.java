package com.xworkz.funrunner;

import com.xworkz.fun.IntBinaryOperator;
import com.xworkz.funass.IntBinaryAss;

public class IntBinaryRunner
{
    public static void main(String[] args) 
    {
        
        IntBinaryOperator sumOperator = (a, b) -> a + b;
        int result = IntBinaryAss.invokeIntBinaryOperator(sumOperator, 5, 7);
        System.out.println("Result: " + result);
    }
}

