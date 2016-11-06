package com.company.flight;

/**
 * Created by papillon on 11/6/2016.
 */
public class CargoOnlyPilot extends Pilot {
    @Override
    public boolean canAccept(Flight f) {
        return f.getPassengers()==0;
    }
}
