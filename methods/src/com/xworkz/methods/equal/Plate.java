package com.xworkz.methods.equal;

public class Plate 
{

	public String pattern;
	public String shape;
	public String brand;
	public int price;
	public int noOfPlate;
	public String color;
	
	public Plate()
	{
		System.out.println("no param for plate");
	}
	
	 @Override
	    public String toString() {
	    	
	    	return "Plate:pattern:"+this.pattern+"\t"+"shape:"+this.shape+"\t"+"brand:"+this.brand+"\t"+"price:"+this.price+"\t"+"noOfPlate:"+this.noOfPlate+"\t"+"color:"+this.color;
	        
	        
	    }
	 
	    @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in plate class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Plate)
	    	{
	    		Plate plate=(Plate)obj;
	    		System.out.println("Comparing:"+plate);
	    		if(this.price == plate.price && this.noOfPlate==plate.noOfPlate&& this.shape.equals(shape) && this.pattern.equals(pattern) )
	    		{
	    			
	    			return true;
	    		}
	    		
	    	}
	    	return false;
    }
}