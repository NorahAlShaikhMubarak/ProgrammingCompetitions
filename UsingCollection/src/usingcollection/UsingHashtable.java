package usingcollection;
import java.util.Hashtable;
public class UsingHashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
        ht1.put(1,"Ali");
        ht1.put(2,"Ahmed");
        ht1.put(1,"Ali");
        ht1.put(3,"Abdullah");

        System.out.println(ht1);
    }
}
