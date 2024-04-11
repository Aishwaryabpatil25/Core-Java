package com.xworkz.interfacemetro;

public class HawaiFreezerRulesImpl implements Freezer,LgFreezer,SamsungFreezer,TeslaFreezer
     {

	@Override
	public void autoCool() 
	{
	 System.out.println("this is Hawaifreezer auto cool method");
	 
	}

	@Override
	public void iceMaker() {
		System.out.println("this is iceMaker method in hawaiFreezer");
		
	}

	@Override
	public void storingFoods() {
		System.out.println("this is storing foods method in hawaifreezer");
		
	}

	
}
