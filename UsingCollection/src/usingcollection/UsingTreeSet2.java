package usingcollection;
import java.util.Iterator;
import java.util.TreeSet;
public class UsingTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student2> ts1 = new TreeSet<>();
        ts1.add(new Student2(1, "Ali", 4.9));
        ts1.add(new Student2(3, "Ahmed", 4.2));
        ts1.add(new Student2(1, "Ali", 4.9));
        ts1.add(new Student2(4, "Abdullah", 4.6));

        System.out.println(ts1);
        
        Iterator<Student2> itr = ts1.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
