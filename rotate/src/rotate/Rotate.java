/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class Rotate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in= new Scanner(new FileReader("input.txt"));
        PrintWriter out= new PrintWriter("output.txt");
        
        List <String> str = new ArrayList<String>();
        int t;
        String s = null,temp = null;
        
        while(in.hasNext())
        {
            t=in.nextInt();
            for(int i=0;i<t;i++)
            {
            
                s=in.next();
                temp=s;
            
            for(int j=0;j<s.length();j++)
            {
                char s1=s.charAt(j);
                temp= new StringBuilder().append(temp).append(s1).toString();
                temp=temp.substring(1);
                str.add(temp);
                Collections.sort(str);
            }
            out.println(str.indexOf(temp));
            str.clear();
    
        }
        }
        out.close();

}
}

