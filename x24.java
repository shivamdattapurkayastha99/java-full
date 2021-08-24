class MyEmployee{
   private int id;
   private String name;
    public String getName(){
        return name;

    }
    public void setName(String n){
        name=n;

    }
    public int getId(){
       return id;

   }
    public void setId(int i){
        id=i;


    }
}

public class x24 {
    public static void main(String[] args) {
        MyEmployee shivam=new MyEmployee();
//        shivam.id=1;
//        shivam.name="shivam";
        shivam.setName("shivam");
        System.out.println(shivam.getName());
        shivam.setId(1);
        System.out.println(shivam.getId());


    }
}