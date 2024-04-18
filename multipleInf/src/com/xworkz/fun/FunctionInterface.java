package com.xworkz.fun;

@FunctionalInterface
public interface FunctionInterface<T, R> 
{
    R apply(T t);
}

