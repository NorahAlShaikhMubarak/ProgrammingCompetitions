package usingcollection;
import java.util.HashMap;
import java.util.Map;
public class UsingMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1,"Ali");
        map1.put(2,"Ahmed");
        map1.put(1,"Ali");
        map1.put(3,"Abdullah");

        System.out.println(map1);
    }
}
