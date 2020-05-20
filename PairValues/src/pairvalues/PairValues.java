/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairvalues;
import java.util.Scanner;


public class PairValues {
    
    static Scanner s; 
    static int x;



    public static void main(String[] args) {
        
        s= new Scanner(System.in);
        int sum1=3;
        int sum2=3;
        
        System.out.println("Enter an even number of elemnts in the array:");
        x=s.nextInt();
        int n[]= new int[x];
        for (int index = 0; index <= x; index++) {
        n[index] = s.nextInt(); 
        }
        
        if(n[0]+n[3]==sum1)
        {
            System.out.println("true");
        }
        else if(n[1]+n[2]==sum2)
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    
}
}
