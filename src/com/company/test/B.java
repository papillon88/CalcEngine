package com.company.test;

/**
 * Created by papillon on 11/6/2016.
 */
public class B extends A {
    char ch = 'B';
    public char getChB(){
        return ch;
    }
    @Override
    public int commonMethod(){
        return 400;
    }
}
