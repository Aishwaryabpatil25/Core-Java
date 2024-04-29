package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.RubberDTO;

public class RubberRunner {

	public static void main(String[] args) {
		
		RubberDTO rubber1 = new RubberDTO("toyo", "blue", "round", "may/25");
		RubberDTO rubber2 = new RubberDTO("goodyear", "pink", "star", "jan/20");
		RubberDTO rubber3 = new RubberDTO("firestone", "red", "triangle", "jun12");
		RubberDTO rubber4 = new RubberDTO("continental", "green", "square", "july/30");
		RubberDTO rubber5 = new RubberDTO("pirelli", "orange", "round", "sep/23");
		RubberDTO rubber6 = new RubberDTO("yokohama", "yellow", "rectangle", "may/10");
		RubberDTO rubber7 = new RubberDTO("hankook", "white", "square", "july/3");
		RubberDTO rubber8 = new RubberDTO("dunlop", "black", "star", "feb/4");
		RubberDTO rubber9 = new RubberDTO("michelin", "blue", "square", "april/19");
		RubberDTO rubber10 = new RubberDTO("bridgestone", "pink", "triangle", "july/25");
		
		Collection<RubberDTO> rubberCollection=new ArrayList<RubberDTO>();
		rubberCollection.add(rubber1);
		rubberCollection.add(rubber2);
		rubberCollection.add(rubber3);
		rubberCollection.add(rubber4);
		rubberCollection.add(rubber5);
		rubberCollection.add(rubber6);
		rubberCollection.add(rubber7);
		rubberCollection.add(rubber8);
		rubberCollection.add(rubber9);
		rubberCollection.add(rubber10);
		
		rubberCollection.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach(rb->System.out.println(rb));
		System.out.println("_________________________________________________________________________");
		rubberCollection.stream()
		.sorted()
		.filter(r->r.getColor().equals("blue"))
		.collect(Collectors.toList())
		.forEach(rubber->System.out.println(rubber));
		
		
		

	}

}
