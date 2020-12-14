package com.course.test.groups;

import org.testng.annotations.Test;
//类分组测试
@Test(groups="ter")
public class groupClassOne {
    public void tercher(){
        System.out.println("groupsClassz中运行的techerOne");
    }
    public void tercherTwo(){
        System.out.println("groupClass中运行的teacherTwo");
    }
}
