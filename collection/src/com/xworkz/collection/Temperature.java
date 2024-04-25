package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Temperature 
{

	public static Collection<Integer> getTemp()
	{
		Collection<Integer> tempCollection=new ArrayList<Integer>();
		tempCollection.add(27);
		tempCollection.add(38);
		tempCollection.add(21);
		tempCollection.add(23);
		tempCollection.add(20);
		tempCollection.add(10);
		tempCollection.add(15);
		tempCollection.add(40);
		tempCollection.add(9);
		tempCollection.add(12);
		return tempCollection;
	}
}
