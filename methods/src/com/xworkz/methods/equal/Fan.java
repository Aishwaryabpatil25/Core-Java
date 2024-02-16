package com.xworkz.methods.equal;

public class Fan {

   public String brand;
   public String color;
   public String type;
   public int blades ;
   public int speed;
   public int price;
   
   public Fan()
   {
	   System.out.println("no param for fan");
   }
   
   @Override
   public String toString() {
   	
   	return "Fan:brand:"+this.brand+"\t"+"color:"+this.color+"\t"+"type:"+this.type+"\t"+"blades:"+this.blades+"\t"+"speed:"+this.speed+"\t"+"price:"+this.price;
       
       
   }
   
   public boolean equals(Object obj)
   {
   	System.out.println("running in fan class");
   	System.out.println(" " +this);
   	
   	if(obj!=null && obj instanceof Fan)
   	{
   		Fan fan=(Fan)obj;
   		System.out.println("Comparing:"+fan);
   		if(this.blades == fan.blades && this.speed==fan.speed&& this.brand.equals(brand) && this.type.equals(type) )
   		{
   			
   			return true;
   		}
   		
   	}
   	return false;
}
}
