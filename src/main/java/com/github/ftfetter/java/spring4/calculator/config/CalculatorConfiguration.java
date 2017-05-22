package com.github.ftfetter.java.spring4.calculator.config;

import com.github.ftfetter.java.spring4.calculator.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfiguration {

    @Bean
    public CalculatorService threeSums() {
        CalculatorService cs = new CalculatorService();
        cs.calculate(4, 4, 0);
        cs.calculate(3,6,0);
        cs.calculate(1,5,0);
        return cs;
    }

    @Bean
    public CalculatorService subMultiplyDivision() {
        CalculatorService cs = new CalculatorService();
        cs.calculate(5,8,1);
        cs.calculate(7,6,2);
        cs.calculate(9,3,3);
        return cs;
    }

    @Bean
    public CalculatorService divisionByZero() {
        CalculatorService cs = new CalculatorService();
        cs.calculate(4,0,3);
        return cs;
    }

    @Bean
    public CalculatorService powBean() {
        CalculatorService cs = new CalculatorService();
        cs.calculate(5,2,4);
        return cs;
    }

    @Bean
    public CalculatorService invalidOperation() {
        CalculatorService cs = new CalculatorService();
        cs.calculate(3,4,5);
        return cs;
    }

    @Bean
    public CalculatorService recursion(){
        CalculatorService cs = new CalculatorService();
        cs.calculate(cs.calculate(3,3,0),7,2);
        return cs;
    }

}
