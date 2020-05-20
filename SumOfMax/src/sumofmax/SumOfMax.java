/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofmax;
import java.util.Scanner;

public class SumOfMax {
    
    static Scanner s; 
    static int x;

    public static void main(String[] args) {
        
        s= new Scanner(System.in);
        System.out.println("Enter number of elements: ");    
        x= s.nextInt();
        int arr1[]= new int[x];
        int max1= arr1[0];
        int arr2[]= new int[x];
        System.out.println("The array of even and odd numbers: ");    
        for (int index=0; index<x; index++)
        {
            arr1[index]=s.nextInt();
            if(arr1[index]%2==0)
            if(arr1[index]>max1)
            {
                max1 = arr1[index];
        }
        }
            System.out.println(", ");
            int max2= arr2[0];
            for (int index=0; index<x; index++)
            {
                arr2[index]= s.nextInt();
                if(arr2[index]%2!=0)
                if(arr2[index]>max2)
                {
                    max2= arr2[index];
                
            }
            
            }
            int result= max1+max2;
            System.out.println(result);
}
    }

