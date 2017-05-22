package com.github.ftfetter.java.spring4.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorService {

    private Operations operations;
    private List log;

    public CalculatorService(){
        operations = new Operations();
        log = new ArrayList<>();
    }

    public double calculate(double value1, double value2, int op){

        double result = 0d;

        switch (op){
            case 0:
                result = operations.sum(value1,value2);
                log.add(value1+" + "+value2+" = "+result);
                break;
            case 1:
                result = operations.sub(value1,value2);
                log.add(value1+" - "+value2+" = "+result);
                break;
            case 2:
                result = operations.multiply(value1,value2);
                log.add(value1+" * "+value2+" = "+result);
                break;
            case 3:
                if(value2 == 0)
                    log.add("**Division by zero**");
                else {
                    result = operations.division(value1, value2);
                    log.add(value1 + " / " + value2 + " = " + result);
                }
                break;
            case 4:
                result = operations.pow(value1,value2);
                log.add(value1+" ^ "+value2+" = "+result);
                break;
            default:
                log.add("**Invalid operation**");
        }

        return result;
    }

    public void printLog(){
        for(int i=0; i<log.size(); i++){
            System.out.println(log.get(i));
        }
    }

}
