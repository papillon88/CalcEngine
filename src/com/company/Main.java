package com.company;

public class Main {

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation eq = new MathEquation();
        eq.setLeftVal(leftVal);
        eq.setRightVal(rightVal);
        eq.setOpCode(opCode);
        return eq;
    }

    public static void main(String[] args) {

        MathEquation[] me = new MathEquation[4];
        me[0] = create(100,50,'d');
        me[1] = create(100,50,'a');
        me[2] = create(100,50,'s');
        me[3] = create(100,50,'m');

        for(MathEquation meq : me){
            meq.execute();
            System.out.print("result = ");
            System.out.println(meq.getResult());
        }
    }
}
