/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npcarray5;

import java.util.Scanner;

public class NPCArray5 {

  
    public static void main(String[] args) {
        
        boolean no=false;
        Scanner in=new Scanner(System.in);
        String nums= in.nextLine();
        String[] numArr1 = nums.split(" *(,|=>| ) *");
        long add=0;
        for(int i=0;i<numArr1.length;i++){
            if(((i%2==0)&&(Integer.parseInt(numArr1[i])%2==0))==((i%2!=0)&&(Integer.parseInt(numArr1[i])%2!=0)))
            {
            no=true;
            }
           
         }
       if(!no)
       {
           System.out.println("Ideal");
       }
        if(no)
        {
            long first=Integer.parseInt(numArr1[0]);
            long last=Integer.parseInt(numArr1[3]);
            long first1=Integer.parseInt(numArr1[4]);
            long second2=Integer.parseInt(numArr1[7]);
            add=first+last+first1+second2;
          
            System.out.print(add);
        }        
}
}
