package com.xworkz.funrunner;

import com.xworkz.fun.ToDoubleFun;
import com.xworkz.funass.ToDoubleFunAss;

public class ToDoubleFunRunner 
{
    public static void main(String[] args) 
    {
        
        ToDoubleFun<String, Integer> toDoubleFunction = (str, num) -> Double.parseDouble(str) + num;
        double result = ToDoubleFunAss.clickToDoubleFunction(toDoubleFunction, "10.5", 5);
        System.out.println("Result: " + result);
    }
}

