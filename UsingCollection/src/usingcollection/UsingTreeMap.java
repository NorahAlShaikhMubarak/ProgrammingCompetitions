package usingcollection;
import java.util.TreeMap;
public class UsingTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
        map1.put(1,"Ali");
        map1.put(2,"Ahmed");
        map1.put(1,"Ali");
        map1.put(3,"Abdullah");

        System.out.println(map1);
    }
}
