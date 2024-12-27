package org.example.exercism.CalculatorConundrum;

import org.example.exercism.CalculatorConundrum.IllegalOperationException;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String sum = null;
        int calculation =0;
        try{
            if(operation.equals("+") || operation.equals("*") ||operation.equals("/")){

                switch(operation){
                    case "+":
                        calculation = operand1 + operand2;
                        sum = operand1 + " + " + operand2 + " = " +calculation;
                        break;
                    case "*":
                        calculation = operand1 * operand2;
                        sum = operand1 + " * " + operand2 + " = " +calculation;
                        break;
                    case "/":
                        if (operand2 == 0) {
                            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException("Division by zero"));

                        }
                        calculation = operand1 / operand2;
                        sum = operand1 + " / " + operand2 + " = " +calculation;
                        break;
                }
            }
            else if(operation.isEmpty()){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            else if(operation != "+"  || operation != "*" ||operation != "/"){
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }

        }
        catch (NullPointerException e){
            throw new IllegalArgumentException("Operation cannot be null" , e);
        }

        return sum;

    }


    public static void main(String[] args) {
        CalculatorConundrum calculatorConundrum = new CalculatorConundrum();

        System.out.println(calculatorConundrum.calculate(2,0,"/"));
    }

}
