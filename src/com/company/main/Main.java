package com.company.main;

import com.company.calculator.*;
import com.company.flight.CargoFlight;
import com.company.flight.Flight;
import com.company.flight.Passenger;
import com.company.test.A;
import com.company.test.B;
import com.sun.corba.se.spi.oa.ObjectAdapter;

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

        System.out.println("Using inheritance");
        CalculateBase[] cb = {new Adder(100,50),
                              new Subtracter(100,50),
                              new Divider(100,50),
                              new Multiplier(100,50)};

        for(CalculateBase c : cb){
            c.calculate();
            System.out.println(c.getResult());
        }



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

        CargoFlight cf = new CargoFlight();
        cf.add1Package(1,3,5);
        cf.addPassengers(janet);

        Flight f = new CargoFlight();
        f.addPassengers(jane1);
        //cant do this
        //f.add1Package(3,4,5);
        Flight[] squadron = new Flight[5];
        squadron[0]=new Flight();
        squadron[1]=new CargoFlight();
        squadron[2]=new Flight();
        squadron[3]=new CargoFlight();
        squadron[4]=new Flight();

        //Method/Field overriding/hiding
        Flight f1 = new Flight();
        System.out.println(f1.getSEATS());
        CargoFlight cf1 = new CargoFlight();
        System.out.println(cf1.getSEATS());

        Flight f2 = new CargoFlight();
        System.out.println(f2.getSEATS());
        f2.add1Passenger();
        cf1.add1Passenger();

        Object[] obj = new Object[3];
        obj[0] = new Flight();
        obj[1] = new Passenger(0,2);
        obj[2] = new CargoFlight();

        Object o = new Passenger();
        o = new CargoFlight();
        if(o instanceof CargoFlight){
            cf = (CargoFlight)o;
            cf.add1Package(1,2,3);
        }

        Flight f5 = new Flight(173);
        Flight f4 = new Flight(172);
        System.out.println(f5.equals(f4));

        CargoFlight cg = new CargoFlight(145);


        System.out.println("======Test output======");
        A a = new A();
        B b = new B();
        System.out.println(a.getChA());
        System.out.println(b.getChB());

        System.out.println(b.getChA());

        A a2 = new B();
        System.out.println(a2.commonMethod());



    }
}
