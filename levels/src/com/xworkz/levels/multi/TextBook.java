package com.xworkz.levels.multi;

  public class TextBook 
    {
	 public void runBook(Object object)
	 {
		if(object instanceof Book)
		   {
			Book book =(Book)object;
			System.out.println(book.price);
			book.read();
		   
		if(book instanceof Fiction)
		{
			Fiction fiction = (Fiction)book;
			System.out.println(fiction.Language);
			fiction.showFiction();
		
		if(fiction instanceof Mystery)
		{
			Mystery mystery =(Mystery)fiction;
			System.out.println(mystery.format);
			mystery.displayMystery();
		
		if(mystery instanceof Fantasy)
		{
			Fantasy fantasy = (Fantasy)mystery;
			System.out.println(fantasy.author);
			fantasy.showFantasy();
		
		if(fantasy instanceof Comics)
		{
			Comics comics=(Comics)fantasy;
			System.out.println(comics.noOfPages);
			comics.relieveStress();
		}
	   }
	  }	
	 }
    }
  }
}