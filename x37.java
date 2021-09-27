class MyThread1 extends Thread{
    @Override
    public void run() {
        int i=1;

        while (i<5) {
            System.out.println("My Thread1 is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i=1;
        while (i<5) {
            System.out.println("My Thread2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class x37 {

    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}