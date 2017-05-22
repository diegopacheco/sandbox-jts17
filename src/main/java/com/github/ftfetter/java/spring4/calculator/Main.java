package com.github.ftfetter.java.spring4.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.github.ftfetter.java.spring4.calculator")
public class Main {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);

        System.out.println("Three sums:");
        CalculatorService useCalculator = (CalculatorService) applicationContext.getBean("threeSums");
        useCalculator.printLog();

        System.out.println("Sub and Multiply and Division:");
        useCalculator = (CalculatorService) applicationContext.getBean("subMultiplyDivision");
        useCalculator.printLog();

        System.out.println("Division by zero:");
        useCalculator = (CalculatorService) applicationContext.getBean("divisionByZero");
        useCalculator.printLog();

        System.out.println("Pow:");
        useCalculator = (CalculatorService) applicationContext.getBean("powBean");
        useCalculator.printLog();

        System.out.println("Invalid Operation:");
        useCalculator = (CalculatorService) applicationContext.getBean("invalidOperation");
        useCalculator.printLog();

        System.out.println("Recursion:");
        useCalculator = (CalculatorService) applicationContext.getBean("recursion");
        useCalculator.printLog();

        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
