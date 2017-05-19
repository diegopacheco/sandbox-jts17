package com.github.ftfetter.java.spring4.calculator;

import org.junit.Assert;
import org.junit.Test;
import com.github.ftfetter.java.spring4.calculator.Operations;

public class OperationsTest {

    Operations operations = new Operations();

    @Test
    public void testSum(){
        Assert.assertEquals(4,operations.sum(1,3),0);
    }

    @Test
    public void testSub(){
        Assert.assertEquals(1,operations.sub(7,6),0);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(10,operations.multiply(5,2),0);
    }

    @Test
    public void testDivision(){
        Assert.assertEquals(2,operations.division(10,5),0);
    }

    @Test
    public void testPow(){
        Assert.assertEquals(9,operations.pow(3,2),0);
    }
}
