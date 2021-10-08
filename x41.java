class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);

    }

    public void run(){
        int i=21;
        
            System.out.println("I am a thread and my name is "+this.getName());
        
    }
}
public class x41 {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1("Shivam");
        MyThr1 t2=new MyThr1("Datta");
        // t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
