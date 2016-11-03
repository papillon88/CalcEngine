package com.company.calculator;

import com.company.flight.Flight;
import com.company.flight.Passenger;

public class Main {

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation eq = new MathEquation();
        eq.setLeftVal(leftVal);
        eq.setRightVal(rightVal);
        eq.setOpCode(opCode);
        return eq;
    }

    public static void main(String[] args) {

        //Calculator
//        MathEquation test = new MathEquation();
//        test.execute();
//        System.out.print("test result = ");
//        System.out.println(test.getResult());

        System.out.println("======Calculator output======");
        MathEquation[] me = new MathEquation[4];
        me[0] = new MathEquation(100,50,'d');
        me[1] = new MathEquation(100,50,'a');
        me[2] = new MathEquation(100,50,'s');
        me[3] = new MathEquation(100,50,'m');

        for(MathEquation meq : me){
            meq.execute();
            System.out.print("result = ");
            System.out.println(meq.getResult());
        }

        System.out.println("Using Overloads");

        double leftDouble = 9d;
        double rightDouble = 4d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation eqoverload = new MathEquation('d');
        eqoverload.execute(leftDouble,rightDouble);
        System.out.println(eqoverload.getResult());
        eqoverload.execute(leftInt,rightInt);
        System.out.println(eqoverload.getResult());
        eqoverload.execute((double)leftInt,rightInt);
        System.out.println(eqoverload.getResult());

        //Passenger,Flights etc
        System.out.println("======Flight output======");
        Passenger jane1 = new Passenger();
        jane1.setCheckedBags(3);
        Passenger jane2 = new Passenger(2,3);

        Passenger fred = new Passenger(2);
        Passenger jane3 = new Passenger(2,3);

        Flight val1 = new Flight(10);
        Flight val2 = new Flight(20);
        System.out.println(val1.getFlightNumber()+"-------"+val2.getFlightNumber());
        Flight.swapNumbers(val1,val2);
        System.out.println(val1.getFlightNumber()+"-------"+val2.getFlightNumber());

        val1.add1Passenger();
        val1.add1Passenger(jane2,2);
        val1.add1Passenger(2,2);

        Passenger janet = new Passenger(0,1);
        Passenger john = new Passenger(0,3);
        Passenger susie = new Passenger(0,3);
        val2.addPassengers(janet,john,susie);

    }
}
