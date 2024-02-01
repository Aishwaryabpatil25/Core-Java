package com.xworkz.AccessSpecifiers.NatureRunner;

import com.xworkz.AccessSpecifiers.Nature.Biscuit;
import com.xworkz.AccessSpecifiers.Nature.Location;
import com.xworkz.AccessSpecifiers.Nature.Monkey;
import com.xworkz.AccessSpecifiers.Nature.Tree;

public class Runner
       {
          public static void main(String args[]) 
               {
                         Tree tree = new Tree() ;
                       
                         tree.name="bamboo ";
                         System.out.println(tree.name) ;
                         
                         tree.monkey = new Monkey();
                         tree. monkey.age=25;
                         System.out.println(tree. monkey.age) ;
                         
                         tree. monkey.type="Macaques";
                         System.out.println(tree.monkey.type);
                        
                         tree.location = new Location();
                         tree. location.area="West Bengal";
                         System.out.println( tree. location.area);
                         
                         tree. location.city="Hubli";
                         System.out.println(tree. location.city);
                         
                         tree.monkey.biscuit = new Biscuit();
                         tree.monkey.biscuit.brand="Sunfeast";
                         System.out.println(tree.monkey.biscuit.brand);
                         
                         tree.monkey.biscuit.cost=35.4d;
                         System.out.println(tree.monkey.biscuit.cost);
               }
       }
