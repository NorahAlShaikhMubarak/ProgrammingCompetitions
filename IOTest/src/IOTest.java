
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author norahalshaikhmubarak
 */
public class IOTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in= new Scanner(new FileReader("input.txt"));
        PrintWriter out= new PrintWriter("output.txt");
        
        while (in.hasNextLine()) 
        System.out.println(in.nextLine()); 
        
        out.println(in.nextLine());
        out.println(in.next());
        out.println(in.next());
        out.println(in.next());
        
        out.close();

    }
    
}
