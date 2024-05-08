package com.xworkz.collectionrunner;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

import com.xworkz.collection.Handwash;

public class HandwashRunner {

	public static void main(String[] args)
	{
	Collection<String> collection = Handwash.getBrandName();
	
	System.out.println("Total BrandName:"+collection.size());
	
	//adda method using string 
	Collection<String> collection1 = Handwash.getBrandName();
	collection1.add("himalay");
	System.out.println("Add method:"+collection1);
	
	//addall method using string 
	Collection<String> collection2 = Handwash.getBrandName();
	collection2.add("nivea");
    collection.addAll(collection2);
	System.out.println("Add All Method:"+collection2);
	
	//remove method using string
	Iterator<String> hand =collection.iterator();
	{
     while(hand.hasNext())
	{
		String wash=hand.next();
	    
		if(wash.equals("dettol"))
		{
			hand.remove();
		}
	}
     System.out.println("Remove method");
     for(String handwash:collection)
     {
    	 System.out.println(handwash);
     }
    
	}

	
	   System.out.println("Remove all method");
	   Collection<String> collection3 = Handwash.getBrandName();
	   System.out.println(collection);
	   System.out.println(collection3);
	   collection.removeAll(collection3);
	   System.out.println(collection);
	   
	   System.out.println("Remove If Method");
	   Collection<String> collection4 = Handwash.getBrandName();

	   
	   collection4.removeIf(n -> (n.charAt(0) == 'd'));
	   System.out.println("remove if brand starts with n");
	   
	   for(String h:collection4)
	   {
		   System.out.println(h);
	   }
	   
	   System.out.println("Contains Method");
	   Collection<String> collection5 = Handwash.getBrandName();
	   for(String c:collection5)
	   {
		   if(c.contains("lifebuy"))
		   {
			   System.out.println(c);
		   }
	   }
	   
	   System.out.println("Contains All Method");
	   Collection<String> collection6 = Handwash.getBrandName();
//	    collection6.add("envliven");
//	    collection6.add("dettol");
//		collection6.add("santoor");
//		collection6.add("lifebuy");
//		collection6.add("savlon");
//		collection6.add("dove");
//		collection6.add("highgien");
	   System.out.println(collection5.containsAll(collection6));  
	   
	   
	   System.out.println("HashCode Method");
	   System.out.println(collection1.hashCode());
	   
	   System.out.println("Stream Method");
	   Stream<String> hand1=collection6.stream();
	   hand1.forEach(System.out::println);
	   
	   System.out.println("isEmpty Method");
	   System.out.println("Is Empty:"+collection.isEmpty());
	   
	   System.out.println("Clear Mehod");
	   System.out.println("before clear");
	   System.out.println(collection3);
	   collection3.clear();
	   System.out.println("After Clear");
	   System.out.println(collection3);
	   
	   System.out.println("toArray Method");
	   Object[] array = collection1.toArray(); 
	   
       System.out.print("The Array : "+Arrays.toString(array));
       
 
       System.out.println("Retain All Method");
       System.out.println("Before Retain");
       System.out.println(collection2);
       System.out.println(collection1);
       System.out.println("after Retain:");
       collection2.retainAll(collection1);
       System.out.println(collection2);
       System.out.println(collection1);
	}
}




