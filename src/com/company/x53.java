import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class x53 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l2.add(16);
        l2.add(17);
        l2.add(14);
        l2.add(15);
        l1.addAll(l2);
        
        System.out.println(l1.contains(7));
        l1.ensureCapacity(14);
        System.out.println(l1.indexOf(7));
        l1.set(1, 568);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }


    }    
}
