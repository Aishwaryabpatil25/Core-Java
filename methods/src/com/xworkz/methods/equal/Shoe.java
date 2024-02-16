package com.xworkz.methods.equal;

public class Shoe {

	public String brand ;
	public char size;
	public String type ;
	public int price;
	public String material;
	public String color;
	
	public Shoe()
	{
		System.out.println("no param for shoe");
	}
	
	 @Override
	   public String toString() {
	   	
	   	return "Fan:brand:"+this.brand+"\t"+"size:"+this.size+"\t"+"type:"+this.type+"\t"+"price:"+this.price+"\t"+"material:"+this.material+"\t"+"color:"+this.color;
	       
	       
	   }
	 public boolean equals(Object obj)
	   {
	   	System.out.println("running in shoe class");
	   	System.out.println(" " +this);
	   	
	   	if(obj!=null && obj instanceof Shoe)
	   	{
	   		Shoe shoe=(Shoe)obj;
	   		System.out.println("Comparing:"+shoe);
	   		if(this.price == shoe.price && this.color.equals(color) && this.type.equals(type) )
	   		{
	   			
	   			return true;
	   		}
	   		
	   	}
	   	return false;
	}
}
