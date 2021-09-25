//Dynamic method dispatch
package com.company;
class One{
    public void name(){
        System.out.println("My name is shivam");
    }
    public void greet(){
        System.out.println("Good morning");
    }


}
class Two extends One{
    @java.lang.Override
    public void name() {
        System.out.println("My name is shivam in class Two");
    }
    public void welcome(){
        System.out.println("Your are welcome");
    }


}
class x30{
    public static void main(String[] args) {
//        One obj=new One();
//        Two tobj=new Two();
//
//        obj.name();
        One obj=new Two();
        obj.greet();
        obj.name();


    }
}