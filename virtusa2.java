import java.util.*;
import java.math.*;
public class virtusa2 {
    int res=0;

    static int pairs(int k,int arr[])
    {
        Set<Integer> l=new HashSet<>();
        for (int i :arr) {
            l.add(i);

        }
        for (int i :arr) {
            if (l.contains(i+k))
            {
                res++;

            }

        }
        return res;
    }


}
