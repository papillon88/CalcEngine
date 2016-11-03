package com.company.flight;

/**
 * Created by papillon on 11/3/2016.
 */
public class Flight {
    private int passengers,flightNumber,seats=150;
    private char flightClass;
    private boolean[] isSeatAvailable;//tracks each seat

    //Init Block
    {
        isSeatAvailable = new boolean[seats];
        for(int i=0;i<isSeatAvailable.length;i++){
            isSeatAvailable[i]=true;
        }
    }
    public Flight(){}
    public Flight(int flightNumber){
        this.flightNumber=flightNumber;
    }
    public Flight(char flightClass){
        this.flightClass=flightClass;
    }
}
