package com.xworkz.inheritanceobject.chocolaterunner;

import com.xworkz.inheritanceobject.chocolate.Apple;
import com.xworkz.inheritanceobject.chocolate.Banana;
import com.xworkz.inheritanceobject.chocolate.Grape;
import com.xworkz.inheritanceobject.chocolate.Juice;
import com.xworkz.inheritanceobject.chocolate.Kiwi;
import com.xworkz.inheritanceobject.chocolate.Lemon;
import com.xworkz.inheritanceobject.chocolate.Mango;
import com.xworkz.inheritanceobject.chocolate.Orange;
import com.xworkz.inheritanceobject.chocolate.Papaya;
import com.xworkz.inheritanceobject.chocolate.Pineapple;
import com.xworkz.inheritanceobject.chocolate.Pomegranate;
import com.xworkz.inheritanceobject.chocolate.Strawberrie;
import com.xworkz.inheritanceobject.chocolate.Watermelon;

public class JuiceRunner 
   {

	public static void main(String[] args)
	 
	  {
		
		Object obj = new Object();
		
		Juice juice = new Juice();
		juice.runFruit(obj);
		System.out.println("______________________________________");
		
		Object obj1 = new Apple();
		juice.runFruit(obj1);
		System.out.println("______________________________________");
		
		Object obj2 = new Banana();
		juice.runFruit(obj2);
		System.out.println("______________________________________");
		
		Object obj3 = new Grape();
		juice.runFruit(obj3);
		System.out.println("______________________________________");
		
		Object obj4 = new Kiwi();
		juice.runFruit(obj4);
		System.out.println("______________________________________");
		
		Object obj5 = new Lemon();
		juice.runFruit(obj5);
		System.out.println("______________________________________");
		
		Object obj6 = new Mango();
		juice.runFruit(obj6);
		System.out.println("______________________________________");
		
		Object obj7 = new Orange();
		juice.runFruit(obj7);
		System.out.println("______________________________________");
		
		Object obj8 = new Papaya();
		juice.runFruit(obj8);
		System.out.println("______________________________________");
		
		Object obj9 = new Pineapple();
		juice.runFruit(obj9);
		System.out.println("______________________________________");
		
		Object obj10 = new Pomegranate();
		juice.runFruit(obj10);
		System.out.println("______________________________________");
		
		Object obj11 = new Strawberrie();
		juice.runFruit(obj11);
		System.out.println("______________________________________");
		
		Object obj12 = new Watermelon();
		juice.runFruit(obj12);
		
	  }
  }
