package com.xworkz.map.dto;

import java.util.Objects;

public class EmployeeDTO
{
	private String name;
    private String designation;
    private double salary;
    
    public EmployeeDTO()
    {
    	System.out.println("no param for employee dto");
    }

	public EmployeeDTO(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
}
