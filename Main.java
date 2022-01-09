package com.te.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
        Salary bean= container.getBean(Salary.class);
        System.out.println(bean);
    }
}
