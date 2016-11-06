package com.company.flight;

/**
 * Created by papillon on 11/6/2016.
 */
public class CargoFlight extends Flight {
    //Fields
    private float MAX_CARGO_SPACE = 1000f;
    private float usedCargoSpace;
    public int SEATS = 12;
    @Override
    public int getSEATS(){
        return 12;
    }

    //Constructors
    public CargoFlight(){}
    public CargoFlight(int flightNumber){
        super(flightNumber);
    }
    public CargoFlight(int flightNumber,float maxCargoSpace){
        this(flightNumber);
        this.MAX_CARGO_SPACE = maxCargoSpace;
    }

    //Methods
    private boolean hasCargoSpace(float size){
        return usedCargoSpace+size<=MAX_CARGO_SPACE;
    }
    private void handleNoSpace(){
        System.out.println("Not enough space");
    }
    public final void add1Package(float h,float w,float d){
        float size = w*d*h;
        if(hasCargoSpace(size))
            usedCargoSpace+=size;
        else
            handleNoSpace();
    }
}
