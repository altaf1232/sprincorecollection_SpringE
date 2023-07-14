package com.springcorecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
           
     ApplicationContext context= new ClassPathXmlApplicationContext("emp.xml");
     Emp emps=(Emp)context.getBean("emp1");
     
        System.out.println(emps.getName()); 
        System.out.println(emps.getPhones());
        System.out.println(emps.getAddress());
        System.out.println(emps.getCourses());
        System.out.println(emps);
     
    }
}
