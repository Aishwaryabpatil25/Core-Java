package com.xworkz.funass;

import com.xworkz.fun.LongFun;

public class LongFunAss 
{
    public static <R> R printLongFunction(LongFun<R> longFunction, long value) 
    {
        return longFunction.exceute(value);
    }
}

