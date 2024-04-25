package com.xworkz.collectionrunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collection.VoterId;

public class VoterIdRunner {

	public static void main(String[] args) 
	{
		Collection<String> collection=VoterId.getVoterID();
		Iterator<String> iterator=collection.iterator();
		System.out.println("total voter id:"+collection.size());
		
		for(String voter:collection)
		{
			System.out.println(voter);
		}
		
		
		 while (iterator.hasNext()) 
		        
         {
           String id = iterator.next();
//           System.out.println("voter ID: " + id);

           if (id.equals("adf1234567"))
           {
               iterator.remove();
               
           }
       }
		 System.out.println("voter removed duplicates:"+collection.size());

	}

}
