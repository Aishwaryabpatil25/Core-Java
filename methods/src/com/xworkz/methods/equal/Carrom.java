package com.xworkz.methods.equal;

public class Carrom 
{

	public String material;
	public String genre;
	public String brand;
	public int noOfPlayers;
	public int price;
	public String color;
	
	public Carrom()
	{
		System.out.println("no param for carrom");
	}
	
	 @Override
	    public String toString() {
	    	
	    	return "Mug:material:"+this.material+"\t"+"gener:"+this.genre+"\t"+"brand:"+this.brand+"\t"+"noOfPlayers:"+this.noOfPlayers+"\t"+"price:"+this.price+"\t"+"color:"+this.color;
	        
	        
	    }
	 
	 public boolean equals(Object obj)
	    {
	    	System.out.println("running in carrom class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Carrom)
	    	{
	    		Carrom carrom=(Carrom)obj;
	    		System.out.println("Comparing:"+carrom);
	    		if(this.price == carrom.price && this.noOfPlayers==carrom.noOfPlayers&& this.brand.equals(brand) && this.color.equals(color) )
	    		{
	    			
	    			return true;
	    		}
	    		
	    	}
	    	return false;
}
}
