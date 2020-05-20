/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subarraysubstring;

import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class SubarraySubstring {

    /**
     * @param args the command line arguments
     */
 static void find(int [] arr, int length, int s) 
        { 
            // loop for all 2^n combinations 
            for (int i = 1; i <= (Math.pow(2, length)); i++) { 
          
                // sum of a combination 
                int sum = 0; 
          
                for (int j = 0; j < length; j++) 
          
                    // if the bit is 1 then add the element 
                    if (((i >> j) & 1) % 2 == 1) 
                        sum += arr[j]; 
          
                // if the sum is equal to given sum print yes 
                if (sum == s) { 
                    System.out.println("YES"); 
                    return; 
                } 
            } 
          
            // else print no 
            System.out.println("NO"); 
        } 
          
        // driver code 
        public static void main(String[] args) 
        { 
            int sum = 5; 
            int []array = { -1, 2, 4, 121 }; 
            int length = array.length; 
          
            // find whether it is possible to sum to n 
            find(array, length, sum); 
          
        } 
}