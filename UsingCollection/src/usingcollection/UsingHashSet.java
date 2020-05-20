package usingcollection;
import java.util.HashSet;
public class UsingHashSet {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Ali");
        hs1.add("Ahmed");
        hs1.add("Ali");
        hs1.add("Abdullah");
        System.out.println(hs1);
        hs1.remove("Ali");
        System.out.println(hs1);
    }
}
