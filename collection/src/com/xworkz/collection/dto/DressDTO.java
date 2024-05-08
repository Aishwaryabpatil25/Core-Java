package com.xworkz.collection.dto;

import java.io.Serializable;

public class DressDTO implements Serializable,Comparable<DressDTO>
{
	    private String dressName;
	    private String brand;
	    private String color;
	    private double price;
	    
	    
	    
	    public DressDTO()
	    {
	    	System.out.println("no param for Dress");
	    }



		public DressDTO(String dressName, String brand, String color, double price) {
			super();
			this.dressName = dressName;
			this.brand = brand;
			this.color = color;
			this.price = price;
		}


		@Override
		public int compareTo(DressDTO o) 
		{
			
			return 0;
		}

		@Override
		public String toString() {
			return "DressDTO [dressName=" + dressName + ", brand=" + brand + ", color=" + color + ", price=" + price
					+ "]";
		}


		
		@Override
		public boolean equals(Object obj) 
		{
		if(obj!=null)
		{
			if(obj instanceof DressDTO)
			{
				DressDTO dress=(DressDTO)obj;
				if(this.dressName.equals(dressName))
				{
					return true;
				}
			}
		}
			
		return false;
		}

		



		public String getDressName() {
			return dressName;
		}



		public void setDressName(String dressName) {
			this.dressName = dressName;
		}



		public String getBrand() {
			return brand;
		}



		public void setBrand(String brand) {
			this.brand = brand;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		
	    
	    
}