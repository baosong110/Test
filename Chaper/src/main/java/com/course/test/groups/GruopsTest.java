package com.course.test.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GruopsTest {
    @Test(groups ="aerver")
    public void test1(){
        System.out.println("这是分组测试server111111111");
    }
    @Test(groups = "aerver")
    public void test2(){
        System.out.println("这是分组测试server222222222");
    }
    @BeforeGroups("aerver")
    public void beforegroups(){
        System.out.println("分组前测试");
    }
    @AfterGroups("aerver")
    public  void  aftergroups(){
        System.out.println("这是分组后的测试");
    }
    @Test(groups = "slient")
    public void clientOne(){
        System.out.println("这是客户端测试One");
    }
    @Test(groups="slient")
    public void clinetTwo(){
        System.out.println("这是客户端测试Two");
    }
    @BeforeGroups("slient")
    public void beforegroupsone(){
        System.out.println("这是客户端测试前分组");
    }
    @AfterGroups("slient")
    public void aftergroupstwo(){
        System.out.println("这是客户端测试后分组");
    }
}
