package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.MarkerDTO;
import com.xworkz.collection.dto.PerfumeDTO;

public class MarkerDTORunner {

	public static void main(String[] args) {
		
		MarkerDTO marker1=new MarkerDTO("Castell", "pink", 4, 50);
		MarkerDTO marker2=new MarkerDTO("copic", "red", 7, 100);
		MarkerDTO marker3=new MarkerDTO("zig", "yellow", 8, 110);
		MarkerDTO marker4=new MarkerDTO("zan", "orange", 5, 200);
		MarkerDTO marker5=new MarkerDTO("Zebra", "blue", 34, 101);
		MarkerDTO marker6=new MarkerDTO("Pilot", "green", 6, 67);
		MarkerDTO marker7=new MarkerDTO("Tombow", "black", 14, 70);
		MarkerDTO marker8=new MarkerDTO("Posca", "silver", 24, 30);
		MarkerDTO marker9=new MarkerDTO("Faber", "brown", 6, 50);
		MarkerDTO marker10=new MarkerDTO("Staedtler", "sky blue",8, 10);
		
		Collection<MarkerDTO> mark=new ArrayList<MarkerDTO>();
		mark.add(marker1);
		mark.add(marker2);
		mark.add(marker3);
		mark.add(marker4);
		mark.add(marker5);
		mark.add(marker6);
		mark.add(marker7);
		mark.add(marker8);
		mark.add(marker9);
		mark.add(marker10);
		
		
		
		Iterator<MarkerDTO> iterator = mark.iterator();
        while (iterator.hasNext()) {
            MarkerDTO m = iterator.next();
            if (m.getColor().equals("pink"))
            {
                iterator.remove();
            }
        }
        
        System.out.println("\nAfter removing marker:");
        for (MarkerDTO p : mark) 
        {
            System.out.println("removing perfume with the color:"+p.getColor());
        }
      }
	}


