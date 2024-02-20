package com.xworkz.encapsulation.methods;

public class NailPolish 
{
    int price;
    int netQuantity;
    String type;
    String itemForm;
	String color;
	String brand;
	
	public NailPolish()
	{
		System.out.println("no param for nailpolish");
	}
	
	@Override
	public String toString()
	{
		return "NailPolish = price:"+this.price+"\t"+"netQuality:"+this.netQuantity+"\t"+"itemForm:"+this.itemForm+"\t"+"type:"+this.type+"\t"+"color:"+this.color+"\t"+"brand:"+this.brand+"\t";
	}
	
	  @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in nail class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof NailPolish)
	    	{
	    		NailPolish polish=(NailPolish)obj;
	    		
	    		if(this.price == polish.price && this.color.equals(color) && this.type.equals(type) )
	    		{
	    			System.out.println("Comparing:"+polish);
	    			return true;
	    		}
	    		
	    	}
	    	return false;
}
	  
	  public int getPrice()
		{
			return this.price;
		}
		
		public int getNetQuantity()
		{
			return this.netQuantity;
		}
		
		public String getType()
		{
			return this.type;
		}
		public String getItemForm()
		{
			return this.itemForm;
		}
		public String getColor()
		{
			return this.color;
		}
		
		public String getBrand()
		{
			return this.brand;
		}
		
		public void setPrice(int price)
		{
		   this.price=price;
		}
		
		public void setNetQuantity(int netQuantity)
		{
			this.netQuantity=netQuantity;
		}
		
		public void setType(String type)
		{
			this.type=type;
		}
		public void setItemForm(String itemForm)
		{
			this.itemForm = itemForm;
		}
		public void setBrand(String brand)
		{
			this.brand=brand;
		}
		public void setColor(String color)
		{
			this.color=color;
		}
}