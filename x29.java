package com.company;
class A{
    public int a;
    public int shivam(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method2 of class A");
    }
}
class B extends A{


    public void meth2(){
        System.out.println("I am method2 of class B");
    }
    public void meth3(){
        System.out.println("I am method3 of class B");
    }
}
public class x29 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        b.meth2();
    }

}