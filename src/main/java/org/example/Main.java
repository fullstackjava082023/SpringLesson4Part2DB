package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Hello world!");
//        EmployeeDao employeeDao = new EmployeeDao();
//        List employees = employeeDao.selectAllJava();
//        System.out.println(employees);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        EmployeeDao employeeDao = applicationContext.getBean(EmployeeDao.class);
        //employee makes querys to employee table
//        System.out.println(employeeDao.selectAll());
//        List names = employeeDao.selectAll();
//        System.out.println(names);
//        employeeDao.insertEmployee(5, "Jayme", "Finance");
//        names = employeeDao.selectAll();
//        System.out.println(names);
//        employeeDao.selectAllCallback();
//        employeeDao.selectAllCBLambda();
//        CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);
//        customerDao.selectNamesAndPhone();


    }
}