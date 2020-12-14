package com.course.test.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmterTest {
    @Test
    @Parameters({"name", "age","sex"})
    public void paramter(String name ,int age ,String sex){
        System.out.println("姓名: "+name + ", 性别: "+sex +", 年龄: "+age);
    }
}
