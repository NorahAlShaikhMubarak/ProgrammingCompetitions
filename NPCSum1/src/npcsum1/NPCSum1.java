/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npcsum1;

import java.util.Scanner;


public class NPCSum1 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long a;
            long b;
            
            a=sc.nextLong();
            b=sc.nextLong();
            long sum=a+b;
            long fact1=100%a;
            long fact2=100%b;
            if((sum==100)||(fact1==0)||(fact2==0))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
    
}
}
