package usingcollection;
import java.util.LinkedList;

public class UsingLinkedList2 {

    public static void main(String[] args) {
        LinkedList<Student> llist1 = new LinkedList<>();
        llist1.add(new Student(1, "Ali", 4.9));
        llist1.add(new Student(3, "Ahmed", 4.2));
        llist1.add(new Student(1, "Ali", 4.9));
        llist1.add(new Student(4, "Abdullah", 4.6));

        System.out.println(llist1);
        llist1.remove();
        System.out.println(llist1);
    }
}


