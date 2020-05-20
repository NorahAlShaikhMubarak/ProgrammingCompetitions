/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocket;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class Rocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner s=new Scanner(new FileReader("input.txt"));
        PrintWriter out= new PrintWriter("output.txt");
        
        int n=s.nextInt();
        while(n!=0)
        {
            int sum=0;
            int result=0;
            for(int i=0;i<n/3;i++)
            {
                sum+=(3*i+1);
            }
            result=(sum*2)+n;
        
        out.println(result);
        n=s.nextInt();
       }
       out.close();
    
}
}
