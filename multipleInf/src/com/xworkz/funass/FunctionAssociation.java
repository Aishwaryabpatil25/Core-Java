package com.xworkz.funass;

import com.xworkz.fun.FunctionInterface;

public class FunctionAssociation 
{
    public static <T, R> R processFunction(FunctionInterface<T, R> function, T t) 
    {
        return function.apply(t);
    }
}

