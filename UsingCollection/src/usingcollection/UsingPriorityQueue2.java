package usingcollection;
import java.util.PriorityQueue;
public class UsingPriorityQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Student2> pq1 = new PriorityQueue<>();
        pq1.add(new Student2(1, "Ali", 4.9));
        pq1.add(new Student2(3, "Ahmed", 4.2));
        pq1.add(new Student2(1, "Ali", 5.0));
        pq1.add(new Student2(4, "Abdullah", 4.6));
        pq1.add(new Student2(2, "Adnan", 4.0));
        System.out.println(pq1);
        
        pq1.remove();
        System.out.println(pq1);
    }
}


