package com.xworkz.collectionrunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.BoxDTO;

public class BoxDTORunner {

	public static void main(String[] args)
	{
		
       BoxDTO box1=new BoxDTO(100, "pink", 1, "Cardboard");
       BoxDTO box2=new BoxDTO(200, "cream", 2, "Cardboard");
       BoxDTO box3=new BoxDTO(300, "red", 3, "Cardboard");
       BoxDTO box4=new BoxDTO(400, "green", 4, "Cardboard");
       BoxDTO box5=new BoxDTO(500, "red", 5, "Cardboard");
       BoxDTO box6=new BoxDTO(600, "yellow", 6, "Cardboard");
       BoxDTO box7=new BoxDTO(700, "black", 7, "Cardboard");
       BoxDTO box8=new BoxDTO(800, "green", 8, "Cardboard");
       BoxDTO box9=new BoxDTO(200, "brown", 9, "Cardboard");
       BoxDTO box10=new BoxDTO(900, "white", 10, "Cardboard");
       
       Collection<BoxDTO> box=new ArrayList<BoxDTO>();
       box.add(box1);
       box.add(box2);
       box.add(box3);
       box.add(box4);
       box.add(box5);
       box.add(box6);
       box.add(box7);
       box.add(box8);
       box.add(box9);
       box.add(box10);

        System.out.println("Boxes with the color red:");
        for (BoxDTO ref : box) 
        {
        if (ref.getColor().equals("red")) 
        {
        System.out.println(ref);
    }
  }
        
        Iterator<BoxDTO> iterator = box.iterator();
        while (iterator.hasNext()) {
            BoxDTO b = iterator.next();
            if (b.getColor().equals("green"))
            {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing boxes with the color green:");
        for (BoxDTO b : box) 
        {
            System.out.println("removing boxes with the color green:"+b.getColor());
        }
 }
}