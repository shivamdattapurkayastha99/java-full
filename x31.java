package com.company;
abstract class Parent2{
    public Parent2(){
        System.out.println("i am constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();

}
class Child2 extends Parent2{
    @java.lang.Override
    public void greet() {
        System.out.println("Good Morning from  Child2 class");

    }
}
public class x31 {
    public static void main(String[] args) {
        Parent2 p=new Parent2() {
            @java.lang.Override
            public void greet() {
                System.out.println("I am shivam");
            }
        };
        Child2 c=new Child2();

    }
}