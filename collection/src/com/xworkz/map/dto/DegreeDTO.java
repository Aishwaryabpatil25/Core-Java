package com.xworkz.map.dto;

import java.util.Objects;

public class DegreeDTO 
{

	private String stream;
    private double percentage;
    private int yearOfPassing;
    
    public DegreeDTO()
    {
    	System.out.println("no param for degree");
    }

	public DegreeDTO(String stream, double percentage, int yearOfPassing) {
		super();
		this.stream = stream;
		this.percentage = percentage;
		this.yearOfPassing = yearOfPassing;
	}

	@Override
	public String toString() {
		return "DegreeDTO [stream=" + stream + ", percentage=" + percentage + ", yearOfPassing=" + yearOfPassing + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(percentage, stream, yearOfPassing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DegreeDTO other = (DegreeDTO) obj;
		return Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(stream, other.stream) && yearOfPassing == other.yearOfPassing;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
    
    
}
