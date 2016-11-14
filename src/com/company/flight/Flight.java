package com.company.flight;

/**
 * Created by papillon on 11/3/2016.
 */
public class Flight {
    public int SEATS=150;
    public int getSEATS(){
        return 150;
    }
    private final int MAX_CARRY_ONS=SEATS*2;
    private final int MAX_CHECKED_BAGS=SEATS*3;

    private int passengers,flightNumber;
    public int getPassengers(){
        return passengers;
    }
    private char flightClass;
    private boolean[] isSeatAvailable;//tracks each seat

    private int totalCheckedBags,totalCarryOns;

    //Init Block
    {
        isSeatAvailable = new boolean[SEATS];
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

    //Getters and Setters
    public int getFlightNumber(){
        return this.flightNumber;
    }
    public void setFlightNumber(int i){
        this.flightNumber=i;
    }

    //Methods
    public static void swapNumbers(Flight i,Flight j){
        int fn1 = i.getFlightNumber();
        int fn2 = j.getFlightNumber();
        i.setFlightNumber(fn2);
        j.setFlightNumber(fn1);
    }
    private void handleTooMany(){
        System.out.print("too many passengers");
    }
    public void add1Passenger(){
        if(hasSeating()){
            passengers++;
            System.out.println("passenger added to flight with SEATS = "+getSEATS());
        } else {
            handleTooMany();
        }
    }
    public void add1Passenger(int checkedBags, int carryOns){
        if(hasSeating()) {
            if(hasCarryOnSpace(carryOns)){
                if(hasCheckedBagSpace(checkedBags)){
                    add1Passenger();
                    totalCheckedBags+=checkedBags;
                    totalCarryOns+=carryOns;
                }
            }
        }
        System.out.println("passenger added");
    }
    public void add1Passenger(Passenger p,int carryOns){
        if(hasSeating()) {
            if(hasCarryOnSpace(carryOns)){
                if(hasCheckedBagSpace(p.getCheckedBags())){
                    add1Passenger(p.getCheckedBags(),carryOns);
                }
            }
        }
        System.out.println("passenger with "+p.getCheckedBags()+" checked bags added.");
    }
    public void addPassengers(Passenger... p){
        if(hasSeating(p.length)) {
            passengers+=p.length;
            for(Passenger pas : p){
                totalCheckedBags+=pas.getCheckedBags();
                System.out.println("passenger with "+pas.getCheckedBags()+" checked bags added.");
            }
        } else {
            handleTooMany();
        }
    }

    private boolean hasSeating(){
        //return passengers<SEATS;
        return passengers<getSEATS();
    }
    private boolean hasSeating(int count){
        return passengers+count<=SEATS;
    }
    private boolean hasCarryOnSpace(int carryOns){
        return totalCarryOns+carryOns<=MAX_CARRY_ONS;
    }
    private boolean hasCheckedBagSpace(int checkedBags){
        return totalCheckedBags+checkedBags<=MAX_CHECKED_BAGS;
    }

    @Override
    public boolean equals(Object o){
        if(super.equals(o))
            return true;
        if(o instanceof Flight){
            Flight other = (Flight)o;
            return flightNumber==other.flightNumber &&
                    flightClass==other.flightClass;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "SEATS=" + SEATS +
                '}';
    }
}
