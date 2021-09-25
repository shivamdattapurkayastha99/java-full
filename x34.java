interface Camera2{
    void takeSnap();
    void recordVideo();

}
interface Wifi2{
    String []getNetworks();
    void connectToNetwork(String network);

}

class MycellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.. ");
    }
//    void takeSnap(){
//        System.out.println("Taking snap");
//    }
}
class MySmartPhone2 extends MycellPhone2 implements Wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Record Video");
    }

    @java.lang.Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String networkList[]={"Shivam","Datta","Purkayastha"};
        return networkList;
    }

    @java.lang.Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class x34 {
    public static void main(String[] args) {
        Camera2 cam1=new MySmartPhone2();
        cam1.recordVideo();
        MySmartPhone2 s=new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();


    }
}