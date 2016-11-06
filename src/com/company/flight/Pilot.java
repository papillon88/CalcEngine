package com.company.flight;

/**
 * Created by papillon on 11/6/2016.
 */
public abstract class Pilot {

    private Flight currentFlight;
    public void fly(Flight f){
        if(canAccept(f))
            currentFlight=f;
        else
            handleCantAccept();

        }
    public abstract boolean canAccept(Flight f);
    private void handleCantAccept(){
        System.out.println("cant handle flight");
    }
}
