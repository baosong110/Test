package com.course.test.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProdiverTest {
    @Test(dataProvider = "datamethod")
    public void datatest(String name, int age, String sex ){
        System.out.println("姓名 "+name+" ,年龄"+age+", 性别 "+sex);
    }
    @DataProvider(name="datamethod")
  public Object[][]provider(){
        Object[][] test=new  Object[][]{
                {"张三",20,"男"},
                {"李四",50,"女"},
                {"王五",30,"男"},
        };
        return  test;
  };
    @Test(dataProvider = "testData")
    public void testOne(String name ,int age ,String sex){
        System.out.println("testOne"+"姓名 "+name+" 年龄 "+age+" 性别 "+sex);
    }
    @Test(dataProvider = "testData")
    public void testTwo(String name,int age ,String sex){
        System.out.println("testTwo"+"姓名 "+name+" 年龄"+age+" 性别 "+sex);

    }
    @DataProvider(name="testData")
    public Object[][] Provider(Method test){
         Object[][] restart=null;
         if(test.getName().equals("testOne")){
             restart= new Object[][]{
                     {"王朝",20,"男"},
                     {"马汉",30,"男"}
         };

     }else if(test.getName().equals("testTwo")){
             restart=new Object[][]{
                     {"张龙",30,"女"},
                     {"赵虎",40,"男"}
             };
         }
          return  restart;
         }
}
