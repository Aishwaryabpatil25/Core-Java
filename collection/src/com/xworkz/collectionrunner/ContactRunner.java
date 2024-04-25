package com.xworkz.collectionrunner;


import java.util.Collection;

import com.xworkz.collection.ContactNo;

public class ContactRunner {

	public static void main(String[] args) 
	{
		Collection<Long> collection = ContactNo.getContactNo();
		System.out.println("Total ContactNo:"+collection.size());
		
		for(Long no:collection)
		{
			System.out.println(no);
		}
		

	}

}
