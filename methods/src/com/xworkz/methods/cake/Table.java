package com.xworkz.methods.cake;

public class Table {

	public int width;
	public int height;
	public String shape;
	
	public Table()
	{
		System.out.println("no param for table");
	}
	
	public Table(int width,int height,String shape)
	{
		this.width=width;
		this.height=height;
		this.shape=shape;
	}
	@Override
	public String toString() {
	   return "width:"+width+"\t"+"height:"+height+"\t"+"shape:"+shape;
	}
}
