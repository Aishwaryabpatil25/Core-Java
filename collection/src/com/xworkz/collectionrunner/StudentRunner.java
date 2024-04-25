package com.xworkz.collectionrunner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.Student;

public class StudentRunner {

    public static void main(String[] args) {
        Collection<Integer> collection = Student.getStudentId();
        Iterator<Integer> iterator = collection.iterator();

        System.out.println("Total Student id:" + collection.size());
        

        while (iterator.hasNext()) 
        
          {
            Integer id = iterator.next();
            System.out.println("Student ID: " + id);

            if (id==451)
            {
                iterator.remove();
               
            }
        }
        System.out.println("After Student id:" + collection.size());
        
        
        for (Integer id : collection) 
        {
            System.out.println("Student ID: " + id);
        }
        
    }
}
