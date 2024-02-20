package com.xworkz.encapsulation.methods;

public class Cock 
{

	 String brand;
	 String material;
	 String color;
	 int price;
	 int itemWeight;
	 int noOfCockInpack;
 
	
	public Cock()
	{
		System.out.println("no param for cock");
	}
	
	
	@Override
	public String toString()
	{
		return "Pot = brand:"+this.brand+"\t"+"material:"+this.material+"\t"+"color:"+this.color+"\t"+"Price:"+this.price+"\t"+"itemWeight:"+this.itemWeight+"\t"+"noOfCockInpack:"+this.noOfCockInpack+"\t";
	}
	
	 @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in cock class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Cock)
	    	{
	    		Cock cock=(Cock)obj;
	    		
	    		if(this.price == cock.price && this.brand.equals(brand) && this.color.equals(color) )
	    		{
	    			System.out.println("Comparing:"+cock);
	    			return true;
	    		}
	    		
	    	}
	    	return false;
        }
	  
	   public String getBrand()
	   {
		   return this.brand;
	   }
		
		public String getMaterial()
		{
			return this.material;
		}
		public String getColor()
		{
			return this.color;
		}
		public int getPrice()
		{
			return this.price;
		}
		
		public int getItemWeight()
		{
			return this.itemWeight;
		}
		
		public int getNoOfCockInpack()
		{
			return this.noOfCockInpack;
		}
		
		
		public void setBrand(String brand)
		{
			this.brand=brand;
		}
		public void setMaterial(String material)
		{
			this.material = material;
		}
		public void setColor(String color)
		{
			this.color=color;
		}
		public void setPrice(int price)
		{
			this.price=price;
		}
		public void setItemWeight(int itemWeight)
		{
			this.itemWeight=itemWeight;
		}
		public void setNoOfCockInpack(int noOfCockInpack)
		{
			this.noOfCockInpack=noOfCockInpack;
		}
    }
	


