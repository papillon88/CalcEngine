package com.company.calculator;

/**
 * Created by papillon on 11/6/2016.
 */
public class Multiplier extends CalculateBase {
    public Multiplier(){}
    public Multiplier(double leftVal,double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
