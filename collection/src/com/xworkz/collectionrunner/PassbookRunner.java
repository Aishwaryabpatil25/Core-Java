package com.xworkz.collectionrunner;

import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.Passbook;

public class PassbookRunner 
{

	public static void main(String[] args) 
	{
		
//		Collection<Integer> passbookCollection=Passbook.getPassbookNo();
//		System.out.println("total passbook:"+passbookCollection.size());
//		
//		Iterator<Integer> itr=passbookCollection.iterator();
	
		Collection<String> passbookCollection=Passbook.getPassbookNo();
		System.out.println("total passbook:"+passbookCollection.size());
		
		Iterator<String> itr=passbookCollection.iterator();
		
		 System.out.println("Numbers starting with 4:");
	        for (String number : passbookCollection) 
	        {
	            if (number.startsWith("4")) 
	            {
	                System.out.println(number);
	            }
	        }

	       
	        System.out.println("\nNumbers containing 0:");
	        for (String number : passbookCollection) 
	        {
	            if (number.contains("0")) 
	            {
	                System.out.println(number);
	            }
	        }
	        
	    }
}








//
//// Printing all passbook numbers starting with 4
//System.out.println("Passbook numbers starting with 4:");
//for (Integer number : passbookNumbers) {
//    if (startsWith(number, 4)) {
//        System.out.println(number);
//    }
//}
//
//// Printing all passbook numbers containing 0
//System.out.println("\nPassbook numbers containing 0:");
//for (Integer number : passbookNumbers) {
//    if (contains(number, 0)) {
//        System.out.println(number);
//    }
//}
//}
//
//// Method to check if a number starts with a specific digit
//private static boolean startsWith(int number, int digit) {
//String numStr = String.valueOf(number);
//return numStr.startsWith(String.valueOf(digit));
//}
//
//// Method to check if a number contains a specific digit
//private static boolean contains(int number, int digit) {
//String numStr = String.valueOf(number);
//return numStr.contains(String.valueOf(digit));
//}
//}