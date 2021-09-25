package com.company;
class Base1{
    Base1(){
        System.out.println("I am shivam");
    }
    Base1(int a){
        System.out.println(a);
    }
//    public int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }

}

class Derived1 extends Base1
{
    Derived1(){
        System.out.println("Derived class");
    }
//    public int y;
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }

}
public class x27 {
    public static void main(String[] args) {
//        Base1 b=new Base1();
        Derived1 d=new Derived1();
        Derived1 d2=new Derived1(2);
    }
}