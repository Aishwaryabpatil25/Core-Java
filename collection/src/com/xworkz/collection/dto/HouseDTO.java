package com.xworkz.collection.dto;

/**
 * 
 */
public class HouseDTO {

	private int no;
	private String name;
	private int rooms;
	private String area;
	
	public HouseDTO() {
		System.out.println("no arg for house");
	}
	public HouseDTO(int no, String name, int rooms, String area) 
	{
		super();
		this.no = no;
		this.name = name;
		this.rooms = rooms;
		this.area = area;
	}

	@Override
	public String toString() 
	{
		return "HouseDTO [no=" + no + ", name=" + name + ", rooms=" + rooms + ", area=" + area + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
	
	
}
