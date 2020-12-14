package com.course.test;


import org.testng.annotations.Test;


//忽略测试
public class IngioTest {
    @Test(enabled = false)
    public void ingiotest(){
        System.out.println("ingio忽略测试执行");
    }
    @Test
    public void ingiotxt(){
        System.out.println("ingio这是忽略测试执行");
    }
    @Test(enabled = true)
    public void ingiottx(){
        System.out.println("ingiottx这是忽略测试");
    }
}
