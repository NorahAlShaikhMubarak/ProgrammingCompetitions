/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairisogram;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class PairIsogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        int length=str1.length();
        char arr[]=str1.toCharArray();
        int c=0;

        for(int i=1;i<=length-1;i++)
        {
            if(arr[i]==arr[i-1])
            c++;
        }
        
        System.out.println(str1+" is isogram");
        
       
      

        
}
}