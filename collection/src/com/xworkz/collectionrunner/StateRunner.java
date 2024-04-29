package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.StateDTO;

import javafx.print.Collation;

public class StateRunner {

	public static void main(String[] args)
	{
	
      StateDTO stateCollection = new StateDTO("Karanatak");
      StateDTO stateCollection1 = new StateDTO("maharastra");
      StateDTO stateCollection2 = new StateDTO("Bihar");
      StateDTO stateCollection3 = new StateDTO("goa");
      StateDTO stateCollection4 = new StateDTO("assam");
      
      Collection<StateDTO> ref =new ArrayList<StateDTO>();
      ref.add(stateCollection1);
      ref.add(stateCollection2);
      ref.add(stateCollection3);
      ref.add(stateCollection4);
      
      ref.stream()
      .filter(st->st.getName().startsWith("g"))
      .collect(Collectors.toList())
      .forEach(c->System.out.println(c));
      
      
      
      
	}

}
