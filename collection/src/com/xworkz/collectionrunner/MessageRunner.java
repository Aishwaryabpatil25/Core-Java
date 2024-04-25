package com.xworkz.collectionrunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

import com.xworkz.collection.Message;

public class MessageRunner 
{

    public static void main(String[] args) 
    {
        Collection<String> collection = Message.getMessage();
        System.out.println("Total Messages: " + collection.size());

        Collection<String> filteredMessages = new ArrayList<>();
        Collection<String> specialCharMessages = new ArrayList<>();

        Iterator<String> itr = collection.iterator();
        while (itr.hasNext()) 
        {
            String msg = itr.next();
            if (msg.length() <= 30 && msg.matches("[a-zA-Z0-9 @]+")) 
            {
                filteredMessages.add(msg);
            } else {
                specialCharMessages.add(msg);
                itr.remove(); 
            }
        }

        System.out.println("After Msg Deleted: " + collection.size());
        System.out.println("\nFiltered Messages:");
        for (String msg : filteredMessages) 
        {
            System.out.println(msg);
        }

        System.out.println("After spcl: " + collection.size());
        System.out.println("\nSpecial Character Messages Removed:");
        for (String msg : specialCharMessages) 
        {
            System.out.println(msg);
        }
    }
}
