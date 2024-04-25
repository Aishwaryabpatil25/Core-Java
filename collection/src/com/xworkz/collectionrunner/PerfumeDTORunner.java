package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.BoxDTO;
import com.xworkz.collection.dto.PerfumeDTO;

public class PerfumeDTORunner {

	public static void main(String[] args) {
		
		PerfumeDTO perfume1=new PerfumeDTO("something something", "blue", 200, "Fruity", 8);
		PerfumeDTO perfume2=new PerfumeDTO("engage", "red", 100, "jasmine", 5);
		PerfumeDTO perfume3=new PerfumeDTO("wildstone", "lavender", 2000, "Parfum ", 6);
		PerfumeDTO perfume4=new PerfumeDTO("temptation", "pink", 1200, "Eau de ", 7);
		PerfumeDTO perfume5=new PerfumeDTO("Yardley", "rose", 500, "Eau de Toilette", 4);
		PerfumeDTO perfume6=new PerfumeDTO("FOGG", "cream", 600, "Cologne ", 6);
		PerfumeDTO perfume7=new PerfumeDTO("envy", "orange", 900, "Perfume Oil", 3);
		PerfumeDTO perfume8=new PerfumeDTO("GUESS", "red", 200, "Solid", 9);
		PerfumeDTO perfume9=new PerfumeDTO("Park Avenue", "yellow", 120, "romantic", 7);
		PerfumeDTO perfume10=new PerfumeDTO("Plum", "silver", 5500, "liquid", 3);
		
		Collection<PerfumeDTO> perfume=new ArrayList<PerfumeDTO>();
		perfume.add(perfume1);
		perfume.add(perfume2);
		perfume.add(perfume3);
		perfume.add(perfume4);
		perfume.add(perfume5);
		perfume.add(perfume6);
		perfume.add(perfume7);
		perfume.add(perfume8);
		perfume.add(perfume9);
		perfume.add(perfume10);
		
		Iterator<PerfumeDTO> iterator = perfume.iterator();
        while (iterator.hasNext()) {
            PerfumeDTO p = iterator.next();
            if (p.getBrand().equals("FOGG"))
            {
                iterator.remove();
            }
        }
        
        System.out.println("\nAfter removing perfume:");
        for (PerfumeDTO p : perfume) 
        {
            System.out.println("removing perfume with the brand:"+p.getBrand());
        }
      }
			
   }
		
		
	


