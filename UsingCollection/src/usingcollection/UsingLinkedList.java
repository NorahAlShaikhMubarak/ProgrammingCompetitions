package usingcollection;
import java.util.Iterator;
import java.util.LinkedList;

public class UsingLinkedList {

    public static void main(String[] args) {
        LinkedList<String> llist1 = new LinkedList<>();
        llist1.add("Ali");
        llist1.add("Ahmed");
        llist1.add("Ali");
        llist1.add("Abdullah");

        System.out.println(llist1);
        Iterator<String> itr = llist1.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
