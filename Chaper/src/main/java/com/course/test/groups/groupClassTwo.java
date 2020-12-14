package com.course.test.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class groupClassTwo {
    public void studenFour(){
        System.out.println("groupClassTwo运行studentFour中");
    }
    public void studentFive(){
        System.out.println("groupsClassTwo运行studentFive中");
    }
}
