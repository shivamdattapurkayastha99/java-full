interface Camera{
    void takeSnap();
    void recordVideo();

}
interface Wifi{
    String []getNetworks();
    void connectToNetwork(String network);

}

class MycellPhone{
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
class MySmartPhone extends MycellPhone implements Wifi,Camera{
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
}
public class x32 {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        String ar[]=ms.getNetworks();
        for (String item:ar) {
            System.out.println(item);

        }
    }
}

