package com.company;

public class Main {

    //----III-S
    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation eq = new MathEquation();
        //---IV-S
        /*
        eq.leftVal = leftVal;
        eq.rightVal = rightVal;
        eq.opCode = opCode;
        */
        eq.setLeftVal(leftVal);
        eq.setRightVal(rightVal);
        eq.setOpCode(opCode);
        //---IV-E
        return eq;
    }
    //---III-E

    public static void main(String[] args) {

        //---III-S
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
        //---III-E

        //parallel arrays
        /*
        //---II-S
        double[] leftVals = {100,200,300,2};
        double[] rightVals = {10,20,30,3};
        char[] opcodes = {'d','a','s','m'};
        double[] results = new double[opcodes.length];
        //---II-E
        */

        /*
        for(int i=0;i<opcodes.length;i++){
            //---I-S
            if(opcodes[i]=='a'){
                results[i] = leftVals[i]+rightVals[i];
            } else if(opcodes[i]=='s'){
                results[i] = leftVals[i]+rightVals[i];
            } else if(opcodes[i]=='m'){
                results[i] = leftVals[i]+rightVals[i];
            } else if(opcodes[i]=='d'){
                results[i]=(rightVals[i]==0)?0:leftVals[i]/rightVals[i];
            } else {
                results[i]=0;
                System.out.println("bad value");
            }
            //---I-E

            //---II-S
            switch (opcodes[i]){
                case 'a':
                    results[i] = leftVals[i]+rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i]-rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i]*rightVals[i];
                    break;
                case 'd':
                    results[i]=(rightVals[i]==0)?0:leftVals[i]/rightVals[i];
                default:
                    results[i]=0;
            }

        }
        for(double result : results){
            System.out.print("result = ");
            System.out.println(result);
        }
        //---II-E
        */

        /*
        //---I-S
	    double val1=100;
        double val2=50;
        double result;
        char opcode='p';

        if(opcode=='a'){
            result = val1+val2;
        } else if(opcode=='s'){
            result=val1-val2;
        } else if(opcode=='m'){
            result=val1*val2;
        } else if(opcode=='d'){
            result=(val2==0)?0:val1/val2;
        } else {
            result=0;
            System.out.println("bad value");
        }
        System.out.println(result);
        //---I-E
        */
    }
}
