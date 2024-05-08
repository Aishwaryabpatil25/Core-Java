package com.xworkz.map;

import java.util.Objects;

public class Person 
{

	private String email;
	private String name;
	
	public Person() {
		System.out.println("no param for person");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", name=" + name + "]";
	}
	public Person(String email, String name)
	{
		super();
		this.email = email;
		this.name = name;
	}
	
	
}
