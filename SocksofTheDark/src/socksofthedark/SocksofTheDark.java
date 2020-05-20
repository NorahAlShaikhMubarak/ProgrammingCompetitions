/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socksofthedark;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
/**
 *
 * @author norahalshaikhmubarak
 */
public class SocksofTheDark {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in= new Scanner(new FileReader("input.txt"));


        int t=in.nextInt();
        for(int j=1;j<=t;j++){
        int sum=0;
        int s=0;

        int c= in.nextInt();
        
        for(int i=0; i<c;i++)
        {
            s=in.nextInt();
            sum=sum+s;
        }
        if(c==sum)
        {
            System.out.println(j+". "+"impossible");
        }
        else 
        {
            int min=c+1;
            System.out.println(j+". "+min);    
        }
        
        }

    }
}