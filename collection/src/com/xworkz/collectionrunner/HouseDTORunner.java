package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.HouseDTO;

public class HouseDTORunner {

	public static void main(String[] args) {
		
		HouseDTO house=new HouseDTO(101, "aish", 2, "gadag");
		HouseDTO house1=new HouseDTO(102, "anju", 3, "dvg");
		HouseDTO house2=new HouseDTO(103, "anku", 1, "bangalore");
		HouseDTO house3=new HouseDTO(104, "deepa", 5, "hubli");
		HouseDTO house4=new HouseDTO(105, "divya", 3, "mysore");
		HouseDTO house5=new HouseDTO(106, "disha", 1, "mandya");
		HouseDTO house6=new HouseDTO(107, "shri", 3, "baglkot");
		HouseDTO house7=new HouseDTO(108, "snehi", 2, "durga");
		HouseDTO house8=new HouseDTO(109, "sangi", 1, "hassan");
		HouseDTO house9=new HouseDTO(110, "varshi", 2, "belagavi");
		
		Collection<HouseDTO> home=new ArrayList<HouseDTO>();
		home.add(house);
		home.add(house1);
		home.add(house2);
		home.add(house3);
		home.add(house4);
		home.add(house5);
		home.add(house6);
		home.add(house7);
		home.add(house8);
		home.add(house9);
		
		for(HouseDTO ref:home)
		{
			System.out.println(ref);
		}

	}

}
