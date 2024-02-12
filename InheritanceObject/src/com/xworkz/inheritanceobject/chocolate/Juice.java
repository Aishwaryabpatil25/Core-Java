package com.xworkz.inheritanceobject.chocolate;

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
	   
	   if(object instanceof Grape)
	   {
		   Grape grape = (Grape)fruit;
		   System.out.println(grape.genus);
		   grape.wineMaking();
	   }
	   
	   if(object instanceof Kiwi)
	   {
		   Kiwi kiwi = (Kiwi)fruit;
		   System.out.println(kiwi.vitamin);
		   kiwi.supportsHeartHealth();
	   }
	
	   if(object instanceof Lemon)
	   {
		   
	       Lemon lemon = (Lemon)fruit;
		   System.out.println(lemon.family);
		   lemon.preventKidneyStones();
		   
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
	
	    if(object instanceof Pineapple)
	    {
	    	Pineapple pineapple = (Pineapple)fruit;
	    	System.out.println(pineapple.taste);
	    	pineapple.increaseAllergic();
	    }
	
	    if(object instanceof Pomegranate)
	    {
	    	Pomegranate pomegranate = (Pomegranate)fruit;
	    	System.out.println(pomegranate.calories);
	    	pomegranate.boostDigestion();
	    	
	    }
	
	    if(object instanceof Strawberrie)
	    {
	    	Strawberrie strawberrie = (Strawberrie)fruit;
	    	System.out.println(strawberrie.kingdom);
	    	strawberrie.foodColoring();
	    }
	
	    if(object instanceof Watermelon)
	    {
	    	Watermelon watermelon = (Watermelon)fruit;
	    	System.out.println(watermelon.size);
	    	watermelon.hydrating();
	     }
	    }
      }
   }