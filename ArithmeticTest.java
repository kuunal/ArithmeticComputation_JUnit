package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {
    Arithmetic obj = new Arithmetic(1,2,3);

    @Test
    public void checkFirstExpression(){
        Assert.assertEquals(7,obj.computeFirstExpression());
    }

    @Test
    public void checkSecondExpression(){
        Assert.assertEquals(5,obj.computeSecondExpression());
    }

    @Test
    public void checkThirdExpression(){
        Assert.assertEquals(3,obj.computeThirdExpression());
    }

    @Test
    public void checkFourthExpression(){
        Assert.assertEquals(4,obj.computeFourthExpression());
    }
}