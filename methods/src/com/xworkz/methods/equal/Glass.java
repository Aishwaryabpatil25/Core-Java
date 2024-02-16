package com.xworkz.methods.equal;



public class Glass 
 {
    public int price;
    public String occasion;
    public String brand;
    public String patternType;
    public String color;
    public String shape;
    
    
    public Glass()
    {
    	System.out.println("no param for glass");
    }
    
    @Override
    public String toString() {
    	
    	return "Glass:Price:"+this.price+"\t"+"occasion:"+this.occasion+"\t"+"brand:"+this.brand+"\t"+"patternType:"+this.patternType+"\t"+"color:"+this.color+"\t"+"shape:"+this.shape;
        
        
    }
    
    @Override
    public boolean equals(Object obj)
    {
    	System.out.println("running in glass class");
    	System.out.println(" " +this);
    	
    	if(obj!=null && obj instanceof Glass)
    	{
    		Glass glass=(Glass)obj;
    		System.out.println("Comparing:"+glass);
    		if(this.price == glass.price && this.shape.equals(shape) && this.color.equals(color) )
    		{
    			
    			return true;
    		}
    		
    	}
    	return false;
}
}