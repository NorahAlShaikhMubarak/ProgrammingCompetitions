/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantsy;

import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class Fantsy {
    
    static int max(int a, int b) { return (a > b)? a : b; } 
       
   // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int b, int c[], int p[], int a) 
    { 
         int i, w; 
     int K[][] = new int[a+1][b+1]; 
       
     // Build table K[][] in bottom up manner 
     for (i = 0; i <= a; i++) 
     { 
         for (w = 0; w <= b; w++) 
         { 
             if (i==0 || w==0) 
                  K[i][w] = 0; 
             else if (c[i-1] <= w) 
                   K[i][w] = max(p[i-1] + K[i-1][w-c[i-1]],  K[i-1][w]); 
             else
                   K[i][w] = K[i-1][w]; 
         } 
      } 
       
      return K[a][b]; 
    } 
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        int budget=s.nextInt();
        
        int a=s.nextInt();
        int p=s.nextInt();
        int[] point = new int[3];
        int[] cost = new int[3];
        for (int i = 0; i <a; i++) {
            point[i]=s.nextInt();
            cost[i]=s.nextInt();
        }
        int c = 0;
        System.out.println(knapSack(budget, cost, point, a));

        for (int i = 0; i <cost.length ; i++) {
            if(budget<cost[i])
            {
                c++;
            }
        }
            System.out.println("impossible");
     
}
}
