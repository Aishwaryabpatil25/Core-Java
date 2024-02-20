package com.xworkz.encapsulation.methods;

public class Basket 
{

     String kitchenMaterial;
	 String brand;
	 String color;
	 int price;
	 String shape;
	 String style;
	
	
	public Basket()
	{
		System.out.println("no param for basket");
	}
	
	
	@Override
	public String toString()
	{
		return "Basket = kitchenMaterial:"+this.kitchenMaterial+"\t"+"brand:"+this.brand+"\t"+"color:"+this.color+"\t"+"Price:"+this.price+"\t"+"shape:"+this.shape+"\t"+"style:"+this.style+"\t";
	}
	
	 @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in basket class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Basket)
	    	{
	    		Basket basket=(Basket)obj;
	    		
	    		if(this.price == basket.price && this.brand.equals(brand) && this.color.equals(color) )
	    		{
	    			System.out.println("Comparing:"+basket);
	    			return true;
	    		}
	    		
	    	}
	    	return false;
        }
	  
	   public String getKitchenMaterial()
		{
			return this.kitchenMaterial;
		}
	   public String getBrand()
	   {
		   return this.brand;
	   }
		
		
		public String getColor()
		{
			return this.color;
		}
		public int getPrice()
		{
			return this.price;
		}

		public String getShape()
		{
			return this.shape;
		}
		
		
		public String getStyle()
		{
			return this.style;
		}
		
		public void setKitchenMaterial(String kitchenMaterial)
		{
			this.kitchenMaterial=kitchenMaterial;
		
        }
		
		public void setBrand(String brand)
		{
			this.brand=brand;
		
        }
		public void setColor(String color)
		{
			this.color=color;
		}
		public void setPrice(int price)
		{
			this.price=price;
		}
		public void setShape(String shape)
		{
			this.shape=shape;
		}
		public void setStyle(String style)
		{
			this.style=style;
		}
		
     }
