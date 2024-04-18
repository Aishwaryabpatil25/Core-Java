package com.xworkz.funass;

import com.xworkz.fun.BiConsumerInterface;

public class BiConsumerAssociation 
	{
	    public static <T, U> void processBiConsumer(BiConsumerInterface<T, U> biConsumer, T t, U u) 
	    {
	        biConsumer.accept(t, u);
	    }
	}


