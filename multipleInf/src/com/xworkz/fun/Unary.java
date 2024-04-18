package com.xworkz.fun;

@FunctionalInterface
public interface Unary<T>
{
    T updateUnary(T t);
}
