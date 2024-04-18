package com.xworkz.funass;

import com.xworkz.fun.ToDoubleFun;

public class ToDoubleFunAss
{
    public static <T, U> double clickToDoubleFunction(ToDoubleFun<T, U> toDoubleFunction, T t, U u) 
    {
        return toDoubleFunction.sendAsDouble(t, u);
    }
}

