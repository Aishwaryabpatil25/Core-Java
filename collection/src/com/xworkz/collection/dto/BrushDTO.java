package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Comparator;

public class BrushDTO implements Serializable,Comparable<BrushDTO>
{

	private String brand;
	private Integer price;
	private String material;
	private String type;
	
	
	public BrushDTO(String brand, Integer price, String material, String type)
	{
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.type = type;
	}

	@Override
	public int compareTo(BrushDTO ref) 
	{
		System.out.println("Running compare in brush");
//		if(ref.equals(this.price==50))
//		{
//			return 0;
//		}
//		else if(ref.equals(this.price>50))
//		{
//			return 100;
//		}
//		else
//		{
//			return -100;
//		}
		
		return this.getPrice().compareTo(ref.price);
	}

	
	
	
	@Override
	public String toString() {
		return "BrushDTO [brand=" + brand + ", price=" + price + ", material=" + material + ", type=" + type + "]";
	}
	
	
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}





	
	
	
	
}
