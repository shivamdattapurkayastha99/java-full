class MyThreadRunnable1 implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i am a thread1"); 
        }
        
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i am a thread2"); 
        }
        
    }
}
public class x39 {
    public static void main(String[] args) {
        MyThreadRunnable1 t1=new MyThreadRunnable1();
        Thread p1=new Thread(t1);
        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread p2=new Thread(t2);

        p1.start();
        p2.start();

    }
    
}
