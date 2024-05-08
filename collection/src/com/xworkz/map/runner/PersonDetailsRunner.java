package com.xworkz.map.runner;

import java.util.HashMap;

import com.xworkz.map.PersonDetails;
import com.xworkz.map.dto.DegreeDTO;

public class PersonDetailsRunner 
{

	public static void main(String[] args) 
	{
		 HashMap<String, PersonDetails> personMap = new HashMap<String, PersonDetails>();

	        
	        DegreeDTO degree1 = new DegreeDTO("MCA", 80.2, 2023);
	        DegreeDTO degree2 = new DegreeDTO("B.Tech", 75.5, 2021);
	        DegreeDTO degree3 = new DegreeDTO("M.Tech", 82.5, 2022);
	        DegreeDTO degree4 = new DegreeDTO("BCA", 70.5, 2020);

	        
	        PersonDetails person1 = new PersonDetails("Aishwarya", degree1);
	        PersonDetails person2 = new PersonDetails("Deepa", degree2);
	        PersonDetails person3 = new PersonDetails("Anju", degree3);
	        PersonDetails person4 = new PersonDetails("Fiz", degree4);

	        personMap.put("Aishwarya", person1);
	        personMap.put("Deepa", person2);
	        personMap.put("Anju", person3);
	        personMap.put("Fiz", person4);
	        
	        personMap.forEach((name, person) -> {
	            System.out.println("Person Name: " + name);
	            System.out.println("Degree Stream: " + person.getDegree().getStream());
	            System.out.println("Percentage: " + person.getDegree().getPercentage());
	            System.out.println("Year of Passing: " + person.getDegree().getYearOfPassing());
	        });
    }
}
