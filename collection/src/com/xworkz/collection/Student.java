package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Student {

	public static Collection<Integer> getStudentId()
	{
		Collection<Integer> studentIdCollection = new ArrayList<Integer>();
		studentIdCollection.add(451);
		studentIdCollection.add(452);
		studentIdCollection.add(453);
		studentIdCollection.add(454);
		studentIdCollection.add(455);
		return studentIdCollection;
	}
}
