package com.xworkz.funrunner;

import com.xworkz.fun.BiConsumerInterface;
import com.xworkz.funass.BiConsumerAssociation;

public class BiConsumerRunner 
{
    public static void main(String[] args) 
    {
       
        BiConsumerInterface<String, Integer> biConsumer = (s, i) -> System.out.println("String: " + s + ", Integer: " + i);
        BiConsumerAssociation.processBiConsumer(biConsumer, "Hello", 10);
    }
}

