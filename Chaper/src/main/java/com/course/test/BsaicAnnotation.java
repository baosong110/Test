package com.course.test;
import org.testng.annotations.*;

public class BsaicAnnotation {
    //最基本的注解,用来把方法标记的一部分
         @BeforeClass
         public void beforeClass(){
             System.out.println("beforeClass这是测试类之前运行");
         }
         @AfterClass

         public void afterClass(){
             System.out.println("afterClass这是测试类之后运行的");
         }

        @BeforeMethod
        public void breforeMethod(){
              System.out.println("beforemethod 这是测试方法之前运行的");
    }
       @Test
       public void  TestCase1(){
           System.out.println("这是测试用例1");
       }

       @Test

       public void TestCase2(){
           System.out.println("这是测试用例2");
       }

       @AfterMethod
       public void afterMethod(){
           System.out.println("aftermethd 这是测试方法之后运行");
       }
}



