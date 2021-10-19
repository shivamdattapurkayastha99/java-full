class MyNewThr1 extends Thread{
    

    public void run(){
        int i=21;
        
            System.out.println("I am a thread and my name is "+this.getName());
            // System.out.println("I am a thread and my name is "+this.getName());
        
    }
}
class MyNewThr2 extends Thread{
   

    public void run(){
        int i=21;
        
            System.out.println("I am a thread2 and my name is "+this.getName());
        
    }
}
public class x42 {
public static void main(String[] args) {
    MyNewThr1 t1=new MyNewThr1();
    MyNewThr2 t2=new MyNewThr2();
    t1.start();
    try {
        t1.join();
    } catch (Exception e) {
        System.out.println(e);
    }
    t2.start();
}
    
}
