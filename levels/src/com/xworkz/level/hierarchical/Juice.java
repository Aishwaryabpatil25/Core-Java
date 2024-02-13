package com.xworkz.level.hierarchical;



public class Juice
    {
	public void runFruit(Object object)
	 {
	   if(object instanceof Fruit)
	   {
		    Fruit fruit = (Fruit)object;
			System.out.println(fruit.name);
			fruit.provideNutrients();
	   
	   if(object instanceof Apple)
	   {
		   Apple apple =(Apple)fruit;
		   System.out.println(apple.type);
		   apple.boostImmune();
	   }
	   
	   
	   if(object instanceof Banana)
	   {
		   Banana banana = (Banana)fruit;
		   System.out.println(banana.scientificName);
		   banana.supportForWeightGain();
		   
	   }
	    
	    if(object instanceof Mango)
	    {
	    	Mango mango = (Mango)fruit;
	    	System.out.println(mango.color);
	    	mango.makingPickle();
	    }
	
	    if(object instanceof Orange)
	    {
	    	Orange orange = (Orange)fruit;
	    	System.out.println(orange.netQuantity);
	    	orange.provideVitamin();
	    }
	
	    if(object instanceof Papaya)
	    {
	    	Papaya papaya = (Papaya)fruit;
	    	System.out.println(papaya.price);
	    	papaya.protectingSkin();
	    }
       }
	 }
  }