package com.xworkz.collection.dto;

import java.io.Serializable;

public class MarkerDTO implements Serializable{

	private String brand;
	private String color;
	private int size;
	private int price;
	
	public MarkerDTO()
	{
	System.out.println("no arg const for Marker:");
	}
	
	public MarkerDTO(String brand, String color, int size, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "MarkerDTO [brand=" + brand + ", color=" + color + ", size=" + size + ", price=" + price + "]";
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
