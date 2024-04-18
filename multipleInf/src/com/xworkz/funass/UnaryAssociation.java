package com.xworkz.funass;

import com.xworkz.fun.Unary;

public class UnaryAssociation 
{
    public static <T> T executeUnary(Unary<T> unary, T t) 
    {
        return unary.updateUnary(t);
    }
}
