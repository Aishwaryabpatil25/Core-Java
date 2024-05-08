package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;


import com.xworkz.collection.dto.DressDTO;

public class DressRunner
{

	public static void main(String[] args) 
	{

		
		 // Creating DressDTO objects
        DressDTO dress1 = new DressDTO("jeans", "roadstar", "black", 1000.0);
        DressDTO dress2 = new DressDTO("gown", "dnmk", "pink", 2000.0);
        DressDTO dress3 = new DressDTO("lehanga", "max", "white", 5000.0);
        DressDTO dress4 = new DressDTO("chudi", "ajio", "red", 4000.0);

        Collection<DressDTO> dress = new ArrayList<DressDTO>();
        dress.add(dress1);
        dress.add(dress2);
        dress.add(dress3);
        dress.add(dress4);

        // addAll
        Collection<DressDTO> collection1 = new ArrayList<DressDTO>();
        collection1.addAll(dress);
        System.out.println("all method:"+collection1);
        
        
        //remove
        System.out.println(collection1.remove(dress));
        System.out.println("after removed");
        System.out.println(collection1);
        
        //removeAll
        System.out.println("RemoveAll Method");
        System.out.println(collection1.removeAll(collection1));
        System.out.println("after removed");
        System.out.println(collection1);
        
        //contains
        System.out.println("Contains Method");
        System.out.println(collection1.contains(dress1)); 
        System.out.println(collection1.contains(dress2)); 

        // hashCode
        System.out.println("HashCode Method");
        System.out.println(collection1.hashCode());
        
        System.out.println("Equals Method");
        System.out.println(collection1.equals(collection2));

        
        
		
	}
}