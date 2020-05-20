/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class Hashcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out= new PrintWriter("output.txt");
        Scanner in= new Scanner(new FileReader("a_example.txt")); 
        String tag = null; //tag name
        ArrayList <String> tags = new ArrayList<>();//save all tags
        int slides;
        int c = 0;
        int t=in.nextInt();
        
            for (int i = 0; i < t; i++) {//loop for test
            char hv = in.next().charAt(0);//H or V
            
            int tagnum = in.nextInt();//num of tags
            
            for (int j = 0; j < tagnum; j++) {
                 tag = in.next();
                 tags.add(tag);
            }
            if(hv=='H')
            {
                c++;
            }
        }
    }    
}
