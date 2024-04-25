package com.xworkz.collectionrunner;


import java.util.Collection;

import com.xworkz.collection.City;

public class CityRunner {

	public static void main(String[] args) 
	{
		
		        
		        Collection<String> collection = City.getCity();
		        System.out.println("Total city:"+collection.size());
		        System.out.println("Removed City:"+collection.remove("Ron"));
		        System.out.println("After removed print city :"+collection.size());
		        for (String city : collection) 
		        {
		            System.out.println(city);
		            if(city.startsWith("R"))
		            {
		            	//ConcurrentModificationException it will get exception in this foreach loop we can not add or update any values
		            	collection.remove(city);
		            }
		        }
		        
       }

	}

	


