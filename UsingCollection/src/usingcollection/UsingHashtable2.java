package usingcollection;
import java.util.Hashtable;
public class UsingHashtable2 {
    public static void main(String[] args) {
        Hashtable<Integer, Student> ht1 = new Hashtable<>();
        ht1.put(1,new Student(1, "Ali", 4.9));
        ht1.put(2,new Student(3, "Ahmed", 4.2));
        ht1.put(1,new Student(1, "Ali", 4.9));
        ht1.put(3,new Student(4, "Abdullah", 4.6));

        System.out.println(ht1);
    }
}
