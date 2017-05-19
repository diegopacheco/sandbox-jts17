package com.github.ftfetter.java.spring4.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Operations {

    public double sum(x, y){
        return x+y;
    }

    public double sub(x, y){
        return x-y;
    }

    public double multiply(x, y){
        return x*y;
    }

    public double division(double x, double y){
        return x/y;
    }

    public double pow(double x, double y){
        return Math.pow(x,y);
    }

    public void operations(String result){

    }
}
