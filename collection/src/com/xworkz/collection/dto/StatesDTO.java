package com.xworkz.collection.dto;

import java.io.Serializable;

import com.xworkz.collectionrunner.Direction;

public class StatesDTO implements Serializable,Comparable<StatesDTO>
{
	private String name;
	private Integer population;
	private Direction direction;
    private String chiefMinister;
    private Double revenue;
    private Long budget;
    
   
    public StatesDTO()
    {
    	System.out.println("no param for states dto");
    }
	public StatesDTO(String name, Integer population, Direction direction, String chiefMinister, Double revenue,
			Long budget) 
	{
		super();
		this.name = name;
		this.population = population;
		this.direction = direction;
		this.chiefMinister = chiefMinister;
		this.revenue = revenue;
		this.budget = budget;
	}
	
   
	@Override
	public int compareTo(StatesDTO ref) 
	{
		
		return this.name.compareTo(ref.name);
	}
	@Override
	public String toString() {
		return "StatesDTO [name=" + name + ", population=" + population + ", direction=" + direction
				+ ", chiefMinister=" + chiefMinister + ", revenue=" + revenue + ", budget=" + budget + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public String getChiefMinister() {
		return chiefMinister;
	}
	public void setChiefMinister(String chiefMinister) {
		this.chiefMinister = chiefMinister;
	}
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	public Long getBudget() {
		return budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}
	
    
}


