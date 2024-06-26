package com.xworkz.collection.dto;

import java.io.Serializable;

public class GodDTO implements Serializable,Comparable<GodDTO>
{

	private String name;
	private String place;
	private String gender;
	private String avatar;
	private String specialPower;
	
	public GodDTO()
	{
		System.out.println("no param for god dto");
	}

	public GodDTO(String name, String place, String gender, String avatar, String specialPower) {
		super();
		this.name = name;
		this.place = place;
		this.gender = gender;
		this.avatar = avatar;
		this.specialPower = specialPower;
	}

	@Override
	public String toString() {
		return "GodDTO [name=" + name + ", place=" + place + ", gender=" + gender + ", avatar=" + avatar
				+ ", specialPower=" + specialPower + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getSpecialPower() {
		return specialPower;
	}

	public void setSpecialPower(String specialPower) {
		this.specialPower = specialPower;
	}

	@Override
	public int compareTo(GodDTO ref) {
		
		return this.getName().compareTo(ref.name);
	}
	
	
}
