package com.xworkz.methods.cake;

public class Colgate {

	public String packageType;
	public String itemForm;
	public int price;
	
	public Colgate()
	{
		System.out.println("no param for colgate");
	}
	public Colgate(String packageType,String itemForm,int price)
	{
		this.packageType=packageType;
		this.itemForm=itemForm;
		this.price=price;
	}
	@Override
	public String toString() {
	 System.out.println("tostring for colgate");	
	 return "packageType:"+packageType+"\t"+"itemForm:"+itemForm+"\t"+"price:"+price;
	
	}
}
