package com.xworkz.encapsulation.methods;

public class Pot 
{

	 int width;
	 int height;
	 String brand;
	 String shape;
	 String style;
	 String color;
	
	public Pot()
	{
		System.out.println("no param for pot");
	}
	
	
	@Override
	public String toString()
	{
		return "Pot = width:"+this.width+"\t"+"Height:"+this.height+"\t"+"brand:"+this.brand+"\t"+"shape:"+this.shape+"\t"+"style:"+this.style+"\t"+"color:"+this.color+"\t";
	}
	
	 @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in pot class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Pot)
	    	{
	    		Pot pot=(Pot)obj;
	    		
	    		if(this.width == pot.width && this.shape.equals(shape) && this.style.equals(style) )
	    		{
	    			System.out.println("Comparing:"+pot);
	    			return true;
	    		}
	    		
	    	}
	    	return false;
        }
	  
	    public int getWidth()
		{
			return this.width;
		}
		
		public int getHeight()
		{
			return this.height;
		}
		public String getBrand()
		{
			return this.brand;
		}
		public String getShape()
		{
			return this.shape;
		}
		
		public String getStyle()
		{
			return this.style;
		}
		
		public String getColor()
		{
			return this.color;
		}
		
		
		public void setWidth(int width)
		{
			this.width=width;
		}
		public void setHeight(int height)
		{
			this.height=height;
		}
		
		public void setBrand(String brand)
		{
			this.brand=brand;
		}
		public void setShape(String shape)
		{
			this.shape = shape;
		}
		public void setStyle(String style)
		{
			this.style=style;
		}
		public void setColor(String color)
		{
			this.color=color;
		}
    }
	


