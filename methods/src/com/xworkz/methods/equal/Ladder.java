package com.xworkz.methods.equal;

public class Ladder {

	public int height;
	public int width;
	public int price;
	public String brand;
	public String material;
	public String color;
	
	public Ladder()
	{
		System.out.println("no param for ladder");
	}
	
	 @Override
	    public String toString() {
	    	
	    	return "Ladder:height:"+this.height+"\t"+"width:"+this.width+"\t"+"price:"+this.price+"\t"+"brand:"+this.brand+"\t"+"material:"+this.material+"\t"+"color:"+this.color;
	        
	        
	    }
	 
	    @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in ladder class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Ladder)
	    	{
	    		Ladder ladder=(Ladder)obj;
	    		System.out.println("Comparing:"+ladder);
	    		if(this.price == ladder.price && this.height==ladder.height&& this.brand.equals(brand) && this.color.equals(color) )
	    		{
	    			
	    			return true;
	    		}
	    		
	    	}
	    	return false;
}
}