package usingcollection;
import java.util.TreeSet;
public class UsingTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("Ali");
        ts1.add("Ahmed");
        ts1.add("Ali");
        ts1.add("Abdullah");

        System.out.println(ts1);
    }
}
