package com.xworkz.collection.dto;

import java.io.Serializable;

public class RubberDTO implements Serializable,Comparable<RubberDTO>{

	private String brand;
	private String color;
	private String shape;
	private String manDate;
	
	public RubberDTO()
	{
		System.out.println("no arg for rubber");
	}

	public RubberDTO(String brand, String color, String shape, String manDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.shape = shape;
		this.manDate = manDate;
	}

	
	@Override
	public int compareTo(RubberDTO ref) {
		System.out.println("this is rubberdto");
		return ref.brand.compareTo(this.brand);
	}
	
	@Override
	public String toString() {
		return "RubberDTO [brand=" + brand + ", color=" + color + ", shape=" + shape + ", manDate=" + manDate + "]";
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getManDate() {
		return manDate;
	}

	public void setManDate(String manDate) {
		this.manDate = manDate;
	}

	
}
