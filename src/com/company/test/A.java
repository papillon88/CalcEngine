package com.company.test;

/**
 * Created by papillon on 11/6/2016.
 */
public class A {
    char ch = 'A';
    public char getChA(){
        return ch;
    }
    public char getChFromMethod(){
        return commonMethod();
    }
    public char commonMethod(){
        return ch;
    }
}
