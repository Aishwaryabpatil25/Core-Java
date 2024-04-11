package com.xworkz.typesrunner;

public class FruitRunner {

	
	    public static void main(String[] args) 
	    {
	        Fruit fruit = () -> {
	            String fruitName = "Apple";
	            System.out.println("Selected fruit: " + fruitName);
	            return fruitName;
	        };

	        String selectFruit = fruit.getFruitName();
	        System.out.println("Selected fruit name: " + selectFruit);
	    }
	}

