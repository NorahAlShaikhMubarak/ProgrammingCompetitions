package usingcollection;
import java.util.HashMap;
import java.util.Map;
public class UsingMap2 {
    public static void main(String[] args) {
        Map<Integer, Student> map1 = new HashMap<Integer, Student>();
        map1.put(1,new Student(1, "Ali", 4.9));
        map1.put(2,new Student(3, "Ahmed", 4.2));
        map1.put(1,new Student(1, "Ali", 4.9));
        map1.put(3,new Student(4, "Abdullah", 4.6));

        System.out.println(map1);
    }
}
