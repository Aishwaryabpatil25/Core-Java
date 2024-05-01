package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.GodDTO;

import javafx.collections.transformation.SortedList;

public class GodRunner {

	public static void main(String[] args) 
	{
		
      GodDTO god1 = new GodDTO("Vishnu", " Vaikuntha", "Male", " Preserver of the universe", "Ability to sustain and maintain cosmic order");
      GodDTO god2 = new GodDTO("Kali", " Kali Yuga", "Female", "Dark goddess", "Destruction of evil forces and creation of new beginnings");
      GodDTO god3 = new GodDTO("Shiva", "Mount Kailash", "Male", "Destroyer and transformer", "Destruction of the old to make way for new creation");
      GodDTO god4 = new GodDTO("Zeus", "Mount Olympus", "Male", "Thunderbolt-wielding king", " Control over lightning and storms");
      GodDTO god5 = new GodDTO("Athena", "Athens", "Female", "Wise owl", "Wisdom, strategy, and tactical warfare");
      GodDTO god6 = new GodDTO("Freyja", " Asgard", " Female", " Fierce warrior with a chariot drawn by cats", "Mastery over love, fertility, and war");
      GodDTO god7 = new GodDTO("Saraswati", " Hindu Pantheon", "Female", "Swan", "Patroness of knowledge, music, arts, and wisdom");
      GodDTO god8 = new GodDTO(" Lakshmi", "Vaikuntha", "Female", "Goddess of Wealth and Prosperity", "Bestower of wealth, fortune, and abundance");
      GodDTO god9 = new GodDTO("Krishna", "Vrindavan", "Male", "The Supreme Being", "Divine wisdom, charm, and the ability to restore balance");
      GodDTO god10 = new GodDTO("Ganesha", "Mount Kailash", "Male", " Elephant-headed God", "Remover of obstacles, patron of arts, sciences, and intellect");
      GodDTO god11 = new GodDTO("Shiva", "mysore", "Male", "Destroyer and transformer", "Destruction of the old to make way for new creation");
      
      
      
      Collection<GodDTO> godCollection= new ArrayList<GodDTO>();
      godCollection.add(god1);
      godCollection.add(god2);
      godCollection.add(god3);
      godCollection.add(god4);
      godCollection.add(god5);
      godCollection.add(god6);
      godCollection.add(god7);
      godCollection.add(god8);
      godCollection.add(god9);
      godCollection.add(god10);
      
      
      
      System.out.println("Sorted by name in ascending order:");
      godCollection
              .stream()
              .sorted()
              .forEach(god->System.out.println(god));
      
      System.out.println("___________________________________________________");
      System.out.println("Sort by Place in descending order:");
      godCollection
      .stream()
      .sorted((g1, g2) -> g2.getPlace().compareTo(g1.getPlace()))
      .forEach(god->System.out.println(god));
      
      System.out.println("___________________________________________________");
      System.out.println("place in ascending and print:");
      godCollection
      .stream()
      .sorted((g1, g2) -> g1.getPlace().compareTo(g2.getPlace()))
      .forEach(god->System.out.println(god));
      
      
      System.out.println("___________________________________________________");
      System.out.println("get gender by male sort by avatar in descending:");
      godCollection
      .stream()
      .filter(gender->gender.getGender().equals("Male"))
      .sorted((a1,a2)->a2.getAvatar().compareTo(a1.getAvatar()))
      .forEach(avatar->System.out.println(avatar));
      
      System.out.println("___________________________________________________");
      System.out.println("get all gods by gender female sort by place in descening");
      godCollection
      .stream()
      .filter(gender->gender.getGender().equals("Female"))
      .sorted((gf1,gf2)->gf2.getAvatar().compareTo(gf1.getAvatar()))
      .forEach(av->System.out.println(av));
      
      
      System.out.println("___________________________________________________");
      System.out.println("get only places sort by descending order:");
      godCollection
      .stream()
      .sorted((p1,p2)->p2.getPlace().compareTo(p1.getPlace()))
      .map(place->place.getPlace())
      .forEach(place->System.out.println(place));
      
      System.out.println("___________________________________________________");
      System.out.println("get only special power and sort by descending order:");
      godCollection
      .stream()
      .sorted((sp1,sp2)->sp2.getSpecialPower().compareTo(sp1.getSpecialPower()))
      .map(sp->sp.getSpecialPower())
      .forEach(s->System.out.println(s));
      
      System.out.println("___________________________________________________");
      System.out.println("get all by name and place and get only name sorted in descending:");
      godCollection
      .stream()
      .filter(ref -> ref.getName().equals("Shiva") && ref.getPlace().equals("Mount Kailash"))
      .map(n->n.getName())
      .sorted((n1,n2)->n2.compareTo(n1))
      .forEach(n->System.out.println(n));
      
	}

}
