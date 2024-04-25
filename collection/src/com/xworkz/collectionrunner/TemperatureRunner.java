package com.xworkz.collectionrunner;

import java.util.Collection;
import java.util.Iterator;
import com.xworkz.collection.Temperature;


public class TemperatureRunner 
{

	public static void main(String[] args) 
	{
		
		Collection<Integer> collection=Temperature.getTemp();
        System.out.println("total temp:"+collection.size());
		
        
		 System.out.println("Temperatures greater than 20:");
	        for (int temp : collection) 
	        {
	            if (temp > 20) 
	            {
	                System.out.println(temp);
	            }
	        }

	        
	        System.out.println("\nTemperatures less than 20:");
	        for (int temp : collection)
	        {
	            if (temp < 20) 
	            {
	                System.out.println(temp);
	            }
	        }

	       
	        Iterator<Integer> itr = collection.iterator();
	        while (itr.hasNext())
	        {
	            int temp = itr.next();
	            if (temp < 15)
	            {
	                itr.remove();
	            }
	        }

	        System.out.println("\nTemperatures after removing  less than 15:");
	        System.out.println(collection);
	    }
	}

	

	

