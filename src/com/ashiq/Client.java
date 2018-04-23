package com.ashiq;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String args[]) {

        // Object construction by our own
        Employee eRef = new Employee();
        eRef.setEid(101);
        eRef.setEname("Muhammed Ashiq");
        eRef.setEaddress("Koduvaparamban");

        System.out.println("Emp details : " + eRef);

        //Spring way
        Resource resource = new ClassPathResource("employeebean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee e1 = (Employee)factory.getBean("emp1");
        Employee e2 = factory.getBean("emp2",Employee.class);

        System.out.println("Employee details (emp1) : " + e1);
        System.out.println("Employee details (emp2) : " + e2);
    }
}
