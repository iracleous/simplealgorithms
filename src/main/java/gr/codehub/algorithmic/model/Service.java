/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.algorithmic.model;

import java.util.Date;
import java.util.Scanner;
 

/**
 *
 * @author iracl
 */
public class Service {
    private String name;
    private Date dueDate;
    private String employee;
    private int transactionId;
    private boolean completed;
    private String serviceCategory;

    // violates Single Responsibility Principle
    public  void getDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give service name ");
        name = scanner.next();
        System.out.print("Give date  yyyy-mm-dd ");
        String date = scanner.next();
        String[] dateparts = date.split("-");
        int year = Integer.parseInt(dateparts[0]) - 1900;
        int month =  Integer.parseInt(dateparts[1]) - 1;
        int day = Integer.parseInt(dateparts[2]);
        dueDate = new Date(year, month, day);
        System.out.print("Give employee name ");
        employee = scanner.next();
        System.out.print("Give transaction id ");
        transactionId = scanner.nextInt();
        completed = false;
        System.out.print("Give service category ");
        serviceCategory = scanner.next();
    }
    
    public void print(){
        System.out.println("Service name: " + name +
                "\ndueDate: " + dueDate +
                "\nemployee: " + employee +
                "\ntransactionId: " + transactionId +
                "\ncompleted: " + completed +
                "\nserviceCategory: " + serviceCategory );
    }
 
}
