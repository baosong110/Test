package com.course.test;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void timeout() throws InterruptedException{
        Thread.sleep(2000 );
        System.out.println("2秒后");
    }
    @Test(timeOut = 2000)
    public void timefail() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("2222222222");
    }
}
