package com.company.calculator;

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


        //Passenger,Flights etc
        Passenger jane1 = new Passenger();
        jane1.setCheckedBags(3);
        Passenger jane2 = new Passenger(2,3);

        Passenger fred = new Passenger(2);
        Passenger jane3 = new Passenger(2,3);

    }
}
