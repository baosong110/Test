package com.course.test.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class groupClassThree{
     public void  studentOne(){
         System.out.println("groupClass中studentOne运行中");
     }
     public void studentTwo(){
         System.out.println("groupsClass中studentTwo运行中");
     }
}
