package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collection.dto.StatesDTO;

public class StatesRunner {

	public static void main(String[] args) 
	{
		    StatesDTO states1 = new StatesDTO("Bihar", 1000000, Direction.NORTH, "YS Jagan Mohan Reddy", 100000D, 500000L);
	        StatesDTO states2 = new StatesDTO("Arunachal Pradesh", 2000000, Direction.SOUTH, "Pema Khandu", 200000D, 600000L);
	        StatesDTO states3 = new StatesDTO("Goa", 1500000, Direction.EAST, "Himanta Biswa Sarma", 150000D, 700000L);
	        StatesDTO states4 = new StatesDTO("Andhra Pradesh", 1200000, Direction.WEST, "Nitish Kumar", 120000D, 800000L);
	        StatesDTO states5 = new StatesDTO("Chhattisgarh", 1800000, Direction.NORTH, "Vishnu Deo Sai", 180000D, 900000L);
	        StatesDTO states6 = new StatesDTO("Assam", 1300000, Direction.SOUTH, "Pramod Sawant", 130000D, 1000000L);
	        StatesDTO states7 = new StatesDTO("Gujarat", 1100000, Direction.EAST, "Bhupendra Patel", 110000D, 1100000L);
	        StatesDTO states8 = new StatesDTO("Haryana", 1700000, Direction.WEST, "Nayab Singh Saini", 170000D, 1200000L);
	        StatesDTO states9 = new StatesDTO("Himachal Pradesh", 1400000, Direction.NORTH, "Sukhvinder Singh Sukhu", 140000D, 1300000L);
	        StatesDTO states10 = new StatesDTO("Jharkhand", 1600000, Direction.SOUTH, "Champai Soren", 120000D, 8900000L);
	        StatesDTO states11 = new StatesDTO("Karnataka", 1500000, Direction.SOUTH, "Siddaramaiah", 23000D, 2300000L);
	        StatesDTO states12 = new StatesDTO("Kerala", 600000, Direction.SOUTH, "Pinarayi Vijayan", 130000D, 23400000L);
	        StatesDTO states13 = new StatesDTO("Madhya Pradesh", 100000, Direction.SOUTH, "Mohan Yadav", 210000D, 4400000L);
	        StatesDTO states14 = new StatesDTO("Maharashtra", 2100000, Direction.SOUTH, "Eknath Shinde", 540000D, 100000L);
	        StatesDTO states15 = new StatesDTO("Manipur", 800000, Direction.SOUTH, "N. Biren Singh", 560000D, 140000L);
	        StatesDTO states16 = new StatesDTO("Meghalaya", 100000, Direction.SOUTH, "Conrad Kongkal Sangma", 340000D, 4400000L);
	        StatesDTO states17 = new StatesDTO("Mizoram", 1200000, Direction.SOUTH, "Lalduhoma", 230000D, 1200000L);
	        StatesDTO states18 = new StatesDTO("Nagaland", 2600000, Direction.SOUTH, "Neiphiu Rio", 1340000D, 5600000L);
	        StatesDTO states19 = new StatesDTO("Odisha", 160000, Direction.SOUTH, "Naveen Patnaik", 450000D, 239000L);
	        StatesDTO states20 = new StatesDTO("Punjab", 1800000, Direction.SOUTH, "Bhagwant Singh Mann", 150000D, 1700000L);
	        StatesDTO states21 = new StatesDTO("Rajasthan", 1100000, Direction.SOUTH, "Bhajan Lal Sharma", 780000D, 1300000L);
	        StatesDTO states22 = new StatesDTO("Sikkim", 450000, Direction.SOUTH, "PS Golay", 560000D, 1200000L);
	        StatesDTO states23 = new StatesDTO("Tamil Nadu", 2300000, Direction.SOUTH, "M. K. Stalin", 670000D, 3200000L);
	        StatesDTO states24 = new StatesDTO("Telangana", 120000, Direction.SOUTH, "Anumula Revanth Reddy", 240000D, 1200000L);
	        StatesDTO states25 = new StatesDTO("Tripura", 123000, Direction.SOUTH, "Dr. Manik Saha", 670000D, 4500000L);
	        StatesDTO states26 = new StatesDTO("Uttar Pradesh", 6700000, Direction.SOUTH, "Yogi Aditya Nath", 40000D, 600000L);
	        StatesDTO states27 = new StatesDTO("Uttarakhand", 1200000, Direction.SOUTH, "Pushkar Singh Dhami", 120000D, 1200000L);
	        StatesDTO states28 = new StatesDTO("West Bengal", 86000, Direction.NORTH, "Mamata Banerjee", 760000D, 4500000L);
	        StatesDTO states29 = new StatesDTO("Pandichery", 2300000, Direction.SOUTH, "CM10", 120000D, 2300000L);
	
	
	        Collection<StatesDTO> states= new ArrayList<StatesDTO>();
	        states.add(states1);
	        states.add(states2);
	        states.add(states3);
	        states.add(states4);
	        states.add(states5);
	        states.add(states6);
	        states.add(states7);
	        states.add(states8);
	        states.add(states9);
	        states.add(states10);
	        states.add(states11);
	        states.add(states12);
	        states.add(states13);
	        states.add(states14);
	        states.add(states15);
	        states.add(states16);
	        states.add(states17);
	        states.add(states18);
	        states.add(states19);
	        states.add(states10);
	        states.add(states11);
	        states.add(states12);
	        states.add(states13);
	        states.add(states14);
	        states.add(states15);
	        states.add(states16);
	        states.add(states17);
	        states.add(states18);
	        states.add(states19);
	        states.add(states20);
	        states.add(states21);
	        states.add(states22);
	        states.add(states23);
	        states.add(states24);
	        states.add(states25);
	        states.add(states26);
	        states.add(states27);
	        states.add(states28);
	        states.add(states29);
    
	        System.out.println(states1);
	        System.out.println("Sorted by name in ascending order:");
	        states
	                .stream()
	                .sorted()
	                .forEach(name->System.out.println(name));

	        System.out.println("_________________________________________________________");
	        System.out.println("sort all states in desc");
	        states
	                .stream()
	                .sorted((s1,s2)->s2.getName().compareTo(s1.getName()))
	                .forEach(n->System.out.println(n));
	
	        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	        System.out.println("Get all states with direction WEST");

			states
			.stream()
			    .filter(state -> state.getDirection() == Direction.WEST)
			    .forEach(state -> System.out.println(state));
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			  System.out.println("Get all states with direction South");

				states
				.stream()
				    .filter(state -> state.getDirection() == Direction.SOUTH)
				    .forEach(state -> System.out.println(state));
	              
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				  System.out.println("Get all states with direction NORTH");

					states
					.stream()
					    .filter(state -> state.getDirection() == Direction.NORTH)
					    .forEach(state -> System.out.println(state));
				
					  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
					  System.out.println("Get all states with direction EAST");

						states
						.stream()
						    .filter(state -> state.getDirection() == Direction.EAST)
						    .forEach(state -> System.out.println(state));
	        System.out.println("_________________________________________________________");
	        System.out.println("get all population only by ascending");
	        states
	        .stream()
	        .sorted((p1,p2)->p1.getPopulation().compareTo(p2.getPopulation()))
	        .forEach(p->System.out.println(p));
	        

	        System.out.println("_________________________________________________________");
	        System.out.println("get population only by state name");
	        states
	        .stream()
	        .map(state -> state.getName() ) 
	        .forEach(name->System.out.println(name));
	        
        
	        System.out.println("_________________________________________________________");
	        System.out.println("get cheifminsiter name by state name");
	        states
	        .stream()
	        .filter(ref -> ref.getChiefMinister().equals("Siddaramaiah") && ref.getName().equals("Karnataka"))
	        .map(n->n.getName())
	        .sorted((n1,n2)->n2.compareTo(n1))
	        .forEach(n->System.out.println(n));
	        
	        
	        

	        System.out.println("_________________________________________________________");
            System.out.println("get states with min budget");
            Optional<StatesDTO> stateWithMinBudget = states.stream()
            	    .min((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

            	// Check if the Optional is present and print the minimum budget number
            	stateWithMinBudget.ifPresent(state -> System.out.println("Minimum budget: " + state.getBudget()));
           
           System.out.println("_________________________________________________________");
	        System.out.println("get states with max budget");
	        Optional<StatesDTO> stateWithMaxBudget = states.stream()
		    .max((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Check if the Optional is present and print the minimum budget number
		stateWithMaxBudget.ifPresent(state -> System.out.println("Maximum budget: " + state.getBudget()));
        
		System.out.println("_________________________________________________________");
        System.out.println("get states with second max budget");
    	double maxBudget = stateWithMaxBudget.map(StatesDTO::getBudget).orElse(Long.MIN_VALUE);

		// Find the second maximum budget by filtering out the maximum budget
		Optional<StatesDTO> stateWithSecondMaxBudget = states.stream()
		        .filter(state -> state.getBudget() < maxBudget)
		        .max((s1, s2) -> s1.getBudget().compareTo(s2.getBudget()));

		// Print the second maximum budget if present
		stateWithSecondMaxBudget.ifPresent(state -> System.out.println("Second maximum budget: " + state.getBudget()));
          
	        System.out.println("_________________________________________________________");
            System.out.println("get all revenue greater than 100000");
	        states
	        .stream()
	        .sorted()
	        .filter(r->r.getRevenue()>100000)
	        .forEach(g->System.out.println(g));
	}

}
