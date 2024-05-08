package com.xworkz.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Handwash implements Serializable
{

	public static Collection<String> getBrandName()
	{
		Collection<String> handwashCollection=new ArrayList<String>();
		
		//add method using string
		handwashCollection.add("dettol");
		handwashCollection.add("santoor");
		handwashCollection.add("lifebuy");
		handwashCollection.add("savlon");
		handwashCollection.add("dove");
		handwashCollection.add("highgien");
		
		return handwashCollection;
		
		 
		
	}
}
