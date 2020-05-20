package usingcollection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class UsingArrayDequeue {
    public static void main(String[] args) {
       
        Deque<String> ad1 = new ArrayDeque<>();
        ad1.add("Ali");
        ad1.add("Ahmed");
        ad1.add("Ali");
        ad1.add("Abdullah");
        System.out.println(ad1); //print all elements
                
        ad1.remove(); //remove head
        System.out.println(ad1); 
        ad1.poll(); //remove head
        System.out.println(ad1); 
        ad1.removeLast(); //remove last element
        System.out.println(ad1);
        
        Queue<String> qu=new LinkedList<>();
        qu.add("Norah");
        qu.add("Sultan");
        qu.add("Maha");
        System.out.println(qu);
        qu.remove(); //removes head
        System.out.println(qu);
        qu.poll(); //removes head
        System.out.println(qu);
        qu.add("Ahmed");
        System.out.println(qu);
        qu.peek();
        System.out.println(qu);
    }
}
