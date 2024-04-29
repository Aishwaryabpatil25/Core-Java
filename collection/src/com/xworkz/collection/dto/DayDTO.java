package com.xworkz.collection.dto;

import java.io.Serializable;

public class DayDTO implements Serializable,Comparable<DayDTO>
{
 private String  name;
 private String order;
 
 public DayDTO()
 {
	 System.out.println("no arg for day dto");
 }
public DayDTO(String name, String order)
{
	super();
	this.name = name;
	this.order = order;
}

@Override
public int compareTo(DayDTO ref) {
	
	return this.order.compareTo(ref.order);
}

@Override
public String toString() {
	return "DayDTO [name=" + name + ", order=" + order + "]";
}


public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getOrder()
{
	return order;
}
public void setOrder(String order)
{
	this.order = order;
}
}
