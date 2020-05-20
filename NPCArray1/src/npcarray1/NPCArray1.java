/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npcarray1;

import java.util.Scanner;


public class NPCArray1 {

 
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            int a[] = new int[7];
            boolean no=false;
            long x = 0;
            long y=0;
            for(int i=0;i<7;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<7;i++)
            {
                 x=a[i] % 2;
                 y=a[i]%5;
                if(x!=0 && y!=0)
                {
                    System.out.print(a[i]+" ");
                    no=true;
                }  
            }
            if (!no){
                System.out.println("0");
            }
           
                
            
}
}
