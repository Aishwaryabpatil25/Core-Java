package com.xworkz.levels.multirunner;

import com.xworkz.levels.multi.Book;
import com.xworkz.levels.multi.Comics;
import com.xworkz.levels.multi.Fantasy;
import com.xworkz.levels.multi.Fiction;
import com.xworkz.levels.multi.Mystery;
import com.xworkz.levels.multi.TextBook;

public class BookRunner 
  {
   public static void main(String[] args) 
    {
	 
	   Object object = new Object();
	   
	   TextBook tb = new TextBook();
	   tb.runBook(object);
	   
	   System.out.println("________________________________________");
	   
	   Object obj1 = new Book();
	   tb.runBook(obj1);
	   System.out.println("________________________________________");
	   
	   Book book = new Fiction();
	   tb.runBook(book);
	   System.out.println("________________________________________");
	   
	   Fiction fiction = new Mystery();
	   tb.runBook(fiction);
	   System.out.println("________________________________________");
	   
	   Mystery mystery= new Fantasy();
	   tb.runBook(mystery);
	   System.out.println("________________________________________");
	   
	   Fantasy fantasy= new Comics();
	   tb.runBook(fantasy);
	   System.out.println("________________________________________");
	   
 	}
 }
