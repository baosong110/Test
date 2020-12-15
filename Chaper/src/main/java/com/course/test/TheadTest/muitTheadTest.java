package com.course.test.TheadTest;

import org.testng.annotations.Test;

public class muitTheadTest {
    @Test(invocationCount = 6,threadPoolSize = 5)
    public void muitTest(){
        System.out.println("线程");
        System.out.printf("线 %s%n",Thread.currentThread().getId());
    }
}
