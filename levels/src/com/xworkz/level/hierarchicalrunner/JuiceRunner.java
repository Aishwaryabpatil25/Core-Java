package com.xworkz.level.hierarchicalrunner;

import com.xworkz.level.hierarchical.Apple;
import com.xworkz.level.hierarchical.Banana;
import com.xworkz.level.hierarchical.Juice;
import com.xworkz.level.hierarchical.Mango;
import com.xworkz.level.hierarchical.Orange;
import com.xworkz.level.hierarchical.Papaya;

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
		
		Object obj3 = new Mango();
		juice.runFruit(obj3);
		System.out.println("______________________________________");
		
		Object obj4 = new Papaya();
		juice.runFruit(obj4);
		System.out.println("______________________________________");
		
		Object obj5 = new Orange();
		juice.runFruit(obj5);
		
	  }
  }
