package usingcollection;
import java.util.PriorityQueue;
public class UsingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Ali");
        pq1.add("Ahmed");
        pq1.add("Ali");
        pq1.add("Abdullah");
        System.out.println(pq1);
        
        pq1.remove();
        System.out.println(pq1);
        pq1.poll();
        System.out.println(pq1);        
    }
}
