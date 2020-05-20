package usingcollection;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrList1=new ArrayList<>();
        ArrayList<String> arrList2=new ArrayList<String>(Arrays.asList(new String[]{"a","c","b"}));
        
        System.out.println(arrList1+" "+arrList2); //prints both ArrayList objects
        
        arrList1.add("a");arrList1.add(0,"b");arrList1.add("c"); //adds 3 elements to arrList1 (0,"b") to specify the element index
        System.out.println(arrList1+" "+arrList2);
        
        arrList2.clear(); //clears all elements of arrList2
        System.out.println(arrList1+" "+arrList2);
        
        ArrayList<String> arrList3=(ArrayList) arrList1.clone(); //use clone method for primitive data type, cloning refers to creation of exact copy of an object
        ArrayList<String> arrList4=new ArrayList<>(arrList1); //use copy constructor
        System.out.println(arrList1+" "+arrList2+" "+arrList3+" "+arrList4);
        
        arrList1.add("d");
        System.out.println(arrList1+" "+arrList2+" "+arrList3+" "+arrList4);
        
        System.out.println(arrList1.contains("c"));
        
    }
}
