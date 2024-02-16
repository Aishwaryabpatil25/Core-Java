package com.xworkz.methods.equal;

public class Mug 
{
	public String color;
	public String pattern ;
	public int price;
	public int noOfPiece;
	public String type;
	public String brand;
	
	public Mug()
	{
		System.out.println("no param for mug");
	}
	
	 @Override
	    public String toString() {
	    	
	    	return "Mug:color:"+this.color+"\t"+"pattern:"+this.pattern+"\t"+"price:"+this.price+"\t"+"noOfPiece:"+this.noOfPiece+"\t"+"type:"+this.type+"\t"+"brand:"+this.brand;
	        
	        
	    }
	   public boolean equals(Object obj)
	    {
	    	System.out.println("running in ladder class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Mug)
	    	{
	    		Mug mug=(Mug)obj;
	    		System.out.println("Comparing:"+mug);
	    		if(this.price == mug.price && this.noOfPiece==mug.noOfPiece&& this.brand.equals(brand) && this.color.equals(color) )
	    		{
	    			
	    			return true;
	    		}
	    		
	    	}
	    	return false;
}

}
