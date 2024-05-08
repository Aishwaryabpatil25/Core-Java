package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;



public class PersonRunner {

	public static void main(String[] args) {
		
     Map<String, String> personMap = new HashMap<>();
        
        
        personMap.put("aishupatil451@gmail", "Aishu");
        personMap.put("deepapatil01@email.com", "Deepa");
        personMap.put("sangeeta16@email.com", "Sangeeta");
        personMap.put("vicky04@email.com", "Vicky");
        
        personMap.forEach((email, name) -> System.out.println("\n Email: " + email + "\n Name: " + name));

         

	      

	      

	}

}
