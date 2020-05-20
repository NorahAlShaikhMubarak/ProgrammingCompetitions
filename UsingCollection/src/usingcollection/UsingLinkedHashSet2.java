package usingcollection;
import java.util.LinkedHashSet;
public class UsingLinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<Student> lhs1 = new LinkedHashSet<>();
        lhs1.add(new Student(1, "Ali", 4.9));
        lhs1.add(new Student(3, "Ahmed", 4.2));
        lhs1.add(new Student(1, "Ali", 4.9));
        lhs1.add(new Student(4, "Abdullah", 4.6));

        System.out.println(lhs1);
    }
}
