package com.xworkz.funrunner;

import com.xworkz.fun.ObjIntConsumer;
import com.xworkz.funass.ObjIntConsumerAss;

public class ObjIntConsumerRunner 
{
    public static void main(String[] args) 
    {
        
        ObjIntConsumer<String> objIntConsumer = (str, num) -> System.out.println("String: " + str + ", Integer: " + num);
        ObjIntConsumerAss.generateObjIntConsumer(objIntConsumer, "Hello", 10);
    }
}
