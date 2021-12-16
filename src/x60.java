// package src;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class x60 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(Calendar.YEAR));
    }
}
