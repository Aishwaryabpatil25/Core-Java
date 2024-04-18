package com.xworkz.funass;

import com.xworkz.fun.ObjIntConsumer;

public class ObjIntConsumerAss
{
    public static <T> void generateObjIntConsumer(ObjIntConsumer<T> objIntConsumer, T t, int value) 
    {
        objIntConsumer.getConsumer(t, value);
    }
}

