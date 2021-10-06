class MyThr extends Thread{
    public MyThr(String name){
        super(name);

    }

    public void run(){
        int i=1;
        while (i<3) {
            System.out.println("I am a thread");
        }
    }
}
public class x40 {
    public static void main(String[] args) {
        MyThr t=new MyThr("Shivam");
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
    }
}
