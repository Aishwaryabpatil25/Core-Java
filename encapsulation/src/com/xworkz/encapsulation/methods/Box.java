package com.xworkz.encapsulation.methods;

public class Box 
{
	 int size;
	 int height;
	 String material;
	 String shape;
	 String type;
	 String color;
	
	public Box()
	{
		System.out.println("no param for box");
	}
	
	
	@Override
	public String toString()
	{
		return "NailPolish = size:"+this.size+"\t"+"Height:"+this.height+"\t"+"Material:"+this.material+"\t"+"shape:"+this.shape+"\t"+"type:"+this.type+"\t"+"color:"+this.color+"\t";
	}
	
	 @Override
	    public boolean equals(Object obj)
	    {
	    	System.out.println("running in box class");
	    	System.out.println(" " +this);
	    	
	    	if(obj!=null && obj instanceof Box)
	    	{
	    		Box box=(Box)obj;
	    		
	    		if(this.size == box.size && this.shape.equals(shape) && this.type.equals(type) )
	    		{
	    			System.out.println("Comparing:"+box);
	    			return true;
	    		}
	    		
	    	}
	    	return false;
}
	  
	  public int getSize()
		{
			return this.size;
		}
		
		public int getHeight()
		{
			return this.height;
		}
		
		public String getMaterial()
		{
			return this.material;
		}
		public String getShape()
		{
			return this.shape;
		}
		public String getType()
		{
			return this.type;
		}
		
		public String getColor()
		{
			return this.color;
		}
		
		public void setSize(int size)
		{
		   this.size=size;
		}
		
		public void setHeight(int height)
		{
			this.height=height;
		}
		
		public void setMaterial(String material)
		{
			this.material=material;
		}
		public void setShape(String shape)
		{
			this.shape = shape;
		}
		public void setType(String type)
		{
			this.type=type;
		}
		public void setColor(String color)
		{
			this.color=color;
		}
}
	

