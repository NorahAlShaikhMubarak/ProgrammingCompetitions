package usingcollection;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class UsingLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        lhs1.add("Ali");
        lhs1.add("Ahmed");
        lhs1.add("Ali");
        lhs1.add("Abdullah");

        System.out.println(lhs1);
    }
}
