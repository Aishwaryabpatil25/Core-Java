package com.xworkz.map.dto;

import java.util.Objects;

public class CEODTO 
{

	    private String name;
	    private int experience;
	    private String nativePlace;
	    private double salary;
	    
	    public CEODTO()
	    {
	    	System.out.println("no param for ceo dto");
	    }

		public CEODTO(String name, int experience, String nativePlace, double salary) {
			super();
			this.name = name;
			this.experience = experience;
			this.nativePlace = nativePlace;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "CEODTO [name=" + name + ", experience=" + experience + ", nativePlace=" + nativePlace + ", salary="
					+ salary + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(experience, name, nativePlace, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CEODTO other = (CEODTO) obj;
			return experience == other.experience && Objects.equals(name, other.name)
					&& Objects.equals(nativePlace, other.nativePlace)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		public String getNativePlace() {
			return nativePlace;
		}

		public void setNativePlace(String nativePlace) {
			this.nativePlace = nativePlace;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
	    
}
