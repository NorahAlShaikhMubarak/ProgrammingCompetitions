package usingcollection;
import java.util.HashSet;
public class UsingHashSet2 {
    public static void main(String[] args) {
        HashSet<Student> hs1 = new HashSet<>();
        hs1.add(new Student(1, "Ali", 4.9));
        Student s=new Student(3, "Ahmed", 4.2);
        hs1.add(s);
        hs1.add(new Student(1, "Ali", 4.9));
        hs1.add(new Student(4, "Abdullah", 4.6));
        System.out.println(hs1);
        hs1.remove(s);
        System.out.println(hs1);
    }
}
