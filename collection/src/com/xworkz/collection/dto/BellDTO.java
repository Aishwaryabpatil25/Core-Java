package com.xworkz.collection.dto;

import java.io.Serializable;

public class BellDTO implements Serializable{

	private  String metalUsed;
	private  String type;
	private  int weight;
	private  int height;
	private int price;
	
	public BellDTO()
	{
		System.out.println("no arg for bell");
	}
	public BellDTO(String metalUsed, String type, int weight, int height, int price) {
		super();
		this.metalUsed = metalUsed;
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BellDTO [metalUsed=" + metalUsed + ", type=" + type + ", weight=" + weight + ", height=" + height
				+ ", price=" + price + "]";
	}
	public String getMetalUsed() {
		return metalUsed;
	}
	public void setMetalUsed(String metalUsed) {
		this.metalUsed = metalUsed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
}