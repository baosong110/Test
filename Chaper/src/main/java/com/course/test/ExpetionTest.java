package com.course.test;

import org.testng.annotations.Test;

/** 什么时候需要一场测试
 * 我们需要期望结果为异常的时候
 * 比如,传参为不合法参数  抛出异常
 * 也是我们期望的异常测试结果
 */
public class ExpetionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void expetionfail(){
        System.out.println("这是异常测试expetionfail");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void expectionsucss(){

        System.out.println("这是异常测试expetionScuss");
        throw new RuntimeException();
    }
}
