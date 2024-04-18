package com.xworkz.fun;

@FunctionalInterface
public interface ToDoubleFun<T, U>
{
    double sendAsDouble(T t, U u);
}

