package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

	public class Nature 
	{

	    public static void main(String[] args) 
	    {
	        // Collection of Colors
	        Collection<String> colors = new ArrayList<String>();
	        colors.add("Pink");
	        colors.add("Black");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Orange");
	        colors.add("Grey");
	        colors.add("Yellow");
	        colors.add("Cream");
	        colors.add("Blue");
	        colors.add("Brown");

	        System.out.println("Total Colors: " + colors.size());
	        for (String color : colors)
	        {
	            System.out.println(color);
	        }

	        System.out.println("_____________________________________");
	        
	        // Collection of Presidents
	        Collection<String> presidents = new LinkedList<String>();
	        presidents.add("Ram Nath Kovind");
	        presidents.add("Pranab Mukherjee");
	        presidents.add("APJ Abdul Kalam");
	        presidents.add("Shankar Dayal Sharma");
	        presidents.add("K R Narayan");

	        System.out.println("Number of Presidents: " + presidents.size());
	        for (String president : presidents)
	        {
	            System.out.println(president);
	        }

	        System.out.println("_____________________________________");
	        
	        // Collection of Addresses
	        Collection<String> collection = new ArrayList<String>();
	        collection.add("BTM");
	        collection.add("HSR");
	        collection.add("Rajaji Nagar");
	        collection.add("Jaya Nagar");
	        collection.add("Indira Nagar");
	        collection.add("Kengeri");
	        collection.add("Yelahanka");
	        collection.add("Electronic City");
	        collection.add("Yeshwanthpur");
	        collection.add("Arakere");

	        System.out.println("Total Number Of Addresses: " + collection.size());
	        for (String address : collection) 
	        {
	            System.out.println(address);
	        }
	    }
	}


