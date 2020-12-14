package com.course.test;

import org.testng.annotations.Test;
//依赖测试
public class dependTest {
    @Test
    public void testdepentOne(){
        System.out.println("这是依赖于测试One");
         throw  new RuntimeException();
    }
    @Test(dependsOnMethods = {"testdepentOne"})
    public void testdepentTwo(){
        System.out.println("这是依赖测试One的Two");
    }
}
