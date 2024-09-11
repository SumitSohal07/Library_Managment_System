package com.cestar.controller;

import java.util.Scanner;

import com.cestar.model.Employee;

import com.cestar.dao.EmpDao;

public class Controller {
    EmpDao empDao = new EmpDao();
    Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("Welcome to the Employee Application!");

        // call the dao class to display records
        empDao.displayRecs();
    }

    public void insert() {
        System.out.println("Enter the id of the employee: ");
        int id = scanner.nextInt();
        System.out.println("Enter the name of the employee: ");
        String name = scanner.next();
        System.out.println("Enter the email of the employee: ");
        String email = scanner.next();
        System.out.println("Enter the city of the employee: ");
        String city = scanner.next();
        System.out.println("Enter the phone of the employee: ");
        String phone = scanner.next();

        Employee employee = new Employee(id, name, email, city, phone);
        Employee employee2 = new Employee(id, "john ", email, city, phone);

        empDao.insertRec(employee);
    }

    public void update() {
        System.out.println("Enter the id of the employee: ");
        int id = scanner.nextInt();
        System.out.println("Enter the name of the employee: ");
        String name = scanner.next();
        System.out.println("Enter the email of the employee: ");
        String email = scanner.next();
        System.out.println("Enter the city of the employee: ");
        String city = scanner.next();
        System.out.println("Enter the phone of the employee: ");
        String phone = scanner.next();

        Employee employee = new Employee(id, name, email, city, phone);

        empDao.updateRecord(id, employee);
    }

    public void delete() {
        System.out.println("Enter the id of the employee: ");
        int id = scanner.nextInt();

        empDao.deleteRecord(id);
    }
}