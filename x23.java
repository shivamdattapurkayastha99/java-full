//package com.company;
import java.util.Scanner;
 class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);

    }

}
public class x23 {
    public static void main(String[] args) {
        System.out.println("this is my custom class");
        Employee shivam=new Employee();
        shivam.id=1;
        shivam.name="shivam";

        System.out.println(shivam.id);
        System.out.println(shivam.name);
        shivam.printDetails();
    }
}