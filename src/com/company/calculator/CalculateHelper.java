package com.company.calculator;

/**
 * Created by papillon on 11/13/2016.
 */
public class CalculateHelper {
    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    private static final char ADD = '+';
    private static final char SUBTRACT = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';

    public void process(String statement){
        //add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0]; //add
        this.leftVal = Double.parseDouble(parts[1]); //1.0
        this.rightVal = Double.parseDouble(parts[2]); //2.0
        setCommandFromString(commandString);

        CalculateBase calculator = null;

        switch (this.command){
            case Add:
                calculator = new Adder(this.leftVal,this.rightVal);
                break;
            case Subtract:
                calculator = new Subtracter(this.leftVal,this.rightVal);
                break;
            case Multiply:
                calculator = new Multiplier(this.leftVal,this.rightVal);
                break;
            case Divide:
                calculator = new Divider(this.leftVal,this.rightVal);
                break;
        }

        calculator.calculate();
        result = calculator.getResult();
    }

    private void setCommandFromString(String command){
        //add -> MathCommand.Add
        if(command.equalsIgnoreCase(MathCommand.Add.toString())){
            this.command = MathCommand.Add;
        } else if(command.equalsIgnoreCase(MathCommand.Subtract.toString())){
            this.command = MathCommand.Subtract;
        } else if(command.equalsIgnoreCase(MathCommand.Multiply.toString())){
            this.command = MathCommand.Multiply;
        } else if(command.equalsIgnoreCase(MathCommand.Divide.toString())){
            this.command = MathCommand.Divide;
        } else {
            System.out.println("invalid command");
        }
    }

    @Override
    public String toString() {
        //1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (this.command){
            case Add:
                symbol = ADD;
                break;
            case Subtract:
                symbol = SUBTRACT;
                break;
            case Multiply:
                symbol = MULTIPLY;
                break;
            case Divide:
                symbol = DIVIDE;
                break;
        }
        StringBuilder sb = new StringBuilder(10);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);
        return sb.toString();
    }
}
