package com.course.test.TheadTest;

import org.testng.annotations.Test;

public class TheadTeatXml {
    @Test
    public void XmlThead(){
        System.out.println(Thread.currentThread().getId());
    }
}
