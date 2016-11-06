package com.company.flight;

/**
 * Created by papillon on 11/6/2016.
 */
public class FullLicensePilot extends Pilot {
    @Override
    public boolean canAccept(Flight f) {
        return true;
    }
}
