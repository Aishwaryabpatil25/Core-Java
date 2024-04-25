package com.xworkz.collectionrunner;



import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.BellDTO;

public class BellDTORunner {

	public static void main(String[] args) {
		
		
		BellDTO bell1= new BellDTO("tin", "hand", 20, 30, 400);
		BellDTO bell2= new BellDTO("iron", "ship", 10, 0, 800);
		BellDTO bell3= new BellDTO("steel", "cow", 30, 30, 100);
		BellDTO bell4= new BellDTO("silver", "school", 50, 30, 900);
		BellDTO bell5= new BellDTO("nickel", "dinner", 5, 30, 300);
		BellDTO bell6= new BellDTO("gold", "tower", 8, 30, 600);
		BellDTO bell7= new BellDTO("aluminum", "sleigh", 52, 30, 5000);
		BellDTO bell8= new BellDTO("brass", "japanese", 21, 30, 2000);
		BellDTO bell9= new BellDTO("bronze", "tibetan", 41, 30, 1000);
		BellDTO bell10= new BellDTO("copper", "church", 10, 30, 200);
		
		Collection<BellDTO> bell= new ArrayList<BellDTO>();
		
		bell.add(bell1);
		bell.add(bell2);
		bell.add(bell3);
		bell.add(bell4);
		bell.add(bell5);
		bell.add(bell6);
		bell.add(bell7);
		bell.add(bell8);
		bell.add(bell9);
		bell.add(bell10);
		
		for(BellDTO ref:bell)
		{
			if(ref.getPrice()>1000)
			{
				System.out.println("price greater than 1000:"+ref.getPrice());
			}
		}
		
		System.out.println("\nBells made of bronze:");
        for (BellDTO ref : bell) 
        {
            if (ref.getMetalUsed().equals("bronze"))
            {
                System.out.println("metal used:"+ref.getMetalUsed());
            }
        }
        
        
        System.out.println("\nBells with matching height and weight:");
        for (BellDTO ref : bell) {
            if (ref.getHeight() == ref.getWeight()) 
            {
                System.out.println("Height  is matching:"+ref.getHeight());
                System.out.println("weight is matching:"+ref.getWeight());
            }
        }
       
	}

}
