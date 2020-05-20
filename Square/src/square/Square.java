/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class Square {
    
    static Scanner s=new Scanner(System.in);
    static int factorial(int n) {
      int fact = 1;
      int i = 1;
      while(i <= n) {
         fact *= i;
         i++;
      }
      return fact;
   }
    
    public static void main(String[] args) {
        
      int n = s.nextInt();
      int r = 4, comb;

      comb = factorial(n) / (factorial(r) * factorial(n-r));
      System.out.println("Combination: " + comb);
   }
}
    

