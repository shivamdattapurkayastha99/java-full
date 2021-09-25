class MyMainEmployee{
    private int id;
    private String name;
//    public MyMainEmployee(){
//        id=21;
//        name="shivam";
//
//    }
public MyMainEmployee(String myName){
    id=21;
    name=myName;

}
    public String getName(){
        return name;

    }
    public void setName(String n){
        this.name=n;

    }
    public int getId(){
        return id;

    }
    public void setId(int i){
        this.id=i;


    }


}

public class x25 {
    public static void main(String[] args) {
        MyMainEmployee shivam=new MyMainEmployee("shivam");
//        shivam.setName("shivam");
//        shivam.setId(21);
//        shivam.getName();
//        shivam.getId();
        System.out.println(shivam.getId());
        System.out.println(shivam.getName());

    }
}