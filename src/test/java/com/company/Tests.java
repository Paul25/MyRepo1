package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class Tests {
    @Test
    public void test1(){
Assert.fail();
    }
    @Test
    public void test2(){
        int a=10;
        int b=6;
        int expResult=15;
        Assert.assertEquals("Exp result didn't match",expResult, a + b);
        Assert.assertTrue(expResult==(a+b));

            }

}

