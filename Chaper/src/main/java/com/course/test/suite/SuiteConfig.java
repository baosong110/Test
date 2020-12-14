package com.course.test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite套件前 运行了了");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite套件后运行了");
    }
}
