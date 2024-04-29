package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.BrushDTO;

public class BrushRunner {

	public static void main(String[] args) {
	
		
		
		BrushDTO brush1=new BrushDTO("Colgate",50 ,"plastic" , "Oscillate");
		BrushDTO brush2=new BrushDTO("sensodyne",150 ,"rubber" , "Pulsate");
		BrushDTO brush3=new BrushDTO("oral-b",200 ,"wood" , "Vibrate");
		BrushDTO brush4=new BrushDTO("beatxp",100,"plastic" , "Vibrate");
		BrushDTO brush5=new BrushDTO("AGARO",20 ,"rubber" , "Pulsate");
		BrushDTO brush6=new BrushDTO("CARESMITH",30 ,"rubber" , "Oscillate");
		BrushDTO brush7=new BrushDTO("XML",40 ,"plastic" , "Pulsate");
		BrushDTO brush8=new BrushDTO("Justec",35 ,"plastic" , "Pulsate");
		BrushDTO brush9=new BrushDTO("Digital Shoppy",45 ,"wood" , "Oscillate");
		BrushDTO brush10=new BrushDTO("Perfora",55 ,"rubber" , "Vibrate");
		
		Collection<BrushDTO> brushCollection = new ArrayList<BrushDTO>();
		brushCollection.add(brush1);
		brushCollection.add(brush2);
		brushCollection.add(brush3);
		brushCollection.add(brush4);
		brushCollection.add(brush5);
		brushCollection.add(brush6);
		brushCollection.add(brush7);
		brushCollection.add(brush8);
		brushCollection.add(brush9);
		brushCollection.add(brush10);
		
		brushCollection.stream()
		.sorted().collect(Collectors.toList())
		.forEach(r->System.out.println(r));
		
		System.out.println("_____________________________________________________________");
		
		brushCollection.stream()
		.sorted()
		.filter(b->b.getPrice()>50)
		.collect(Collectors.toList())
		.forEach(brush->System.out.println(brush));
	}
	

}
