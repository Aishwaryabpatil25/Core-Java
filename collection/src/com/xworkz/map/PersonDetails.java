package com.xworkz.map;

import com.xworkz.map.dto.DegreeDTO;

public class PersonDetails
    {
	    private String name;
	    private DegreeDTO degree;
	    
	    public PersonDetails()
	    {
	    	System.out.println("no param for person details");
	    }

	    public PersonDetails(String name, DegreeDTO degree) 
	    {
	        this.name = name;
	        this.degree = degree;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public DegreeDTO getDegree() {
	        return degree;
	    }

	    public void setDegree(DegreeDTO degree) {
	        this.degree = degree;
	    }
	}


