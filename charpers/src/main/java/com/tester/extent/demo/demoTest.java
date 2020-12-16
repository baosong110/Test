package com.tester.extent.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest {
    @Test
    public void testOne(){
        Assert.assertEquals(1,1);
        System.out.println("zheshceshi yonglie 1");
    }
    @Test
    public void testTwo(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void testFour(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这事我们能自己的日志");
        throw new RuntimeException("这事我自己运行的异常") ;
    }
    @Test
    public void rere(){
        System.out.println("ieyriyir ");
    }
}
