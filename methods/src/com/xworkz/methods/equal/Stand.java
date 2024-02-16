package com.xworkz.methods.equal;

public class Stand 
{

	public String condition;
	public String brand;
	public String color;
	public int price;
	public int size;
	public String type;
	
	public Stand()
	{
		System.out.println("no param for stand");
	}
	
	 @Override
	    public String toString() {
	    	
	    	return "Stand:condition:"+this.condition+"\t"+"brand:"+this.brand+"\t"+"color:"+this.color+"\t"+"price:"+this.price+"\t"+"size:"+this.size+"\t"+"type:"+this.type;
	        
	        
	    }
	 public boolean equals(Object obj)
	    {
	    	System.out.println("running in stand class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Stand)
	    	{
	    		Stand stand=(Stand)obj;
	    		System.out.println("Comparing:"+stand);
	    		if(this.price == stand.price && this.size==stand.size&& this.brand.equals(brand) && this.condition.equals(condition) )
	    		{
	    			
	    			return true;
	    		}
	    		
	    	}
	    	return false;
	
}
}