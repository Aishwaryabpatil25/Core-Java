package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.DayDTO;

public class DayRunner {

	public static void main(String[] args) {
		DayDTO day1= new DayDTO("Sunday", "two");
		DayDTO day2= new DayDTO("Monday", "three");
		DayDTO day3= new DayDTO("Tuesday", "five");
		DayDTO day4= new DayDTO("wednsday", "four");
		DayDTO day5= new DayDTO("thursday", "seven");
		DayDTO day6= new DayDTO("friday", "six");
		DayDTO day7= new DayDTO("Satruday", "one");
		
		
		Collection<DayDTO> day= new ArrayList<DayDTO>();
		day.add(day1);
		day.add(day2);
		day.add(day3);
		day.add(day4);
		day.add(day5);
		day.add(day6);
		day.add(day7);
		

		
		day.stream()
//		.filter(d->d.getOrder())
		.sorted()
		.collect(Collectors.toList())
		.forEach(d->System.out.println(d));
	}

}
