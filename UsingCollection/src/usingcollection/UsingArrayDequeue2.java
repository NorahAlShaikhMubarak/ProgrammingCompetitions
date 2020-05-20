package usingcollection;
import java.util.ArrayDeque;
import java.util.Deque;
public class UsingArrayDequeue2 {
    public static void main(String[] args) {
        Deque<Student2> ad1 = new ArrayDeque<>();
        ad1.offer(new Student2(1, "Ali", 4.9));
        ad1.offer(new Student2(3, "Ahmed", 4.2));
        ad1.add(new Student2(1, "Ali", 4.9));
        System.out.println(ad1);
        
        ad1.offerFirst(new Student2(4, "Abdullah", 4.6));
        System.out.println(ad1);
        
        ad1.pollLast();
        System.out.println(ad1);
        
        ad1.removeLast();
        System.out.println(ad1);
        
        
    }
}


