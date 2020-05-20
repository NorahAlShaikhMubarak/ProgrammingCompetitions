/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npcarray4;

import java.util.Scanner;


public class NPCArray4 {

    public static void main(String[] args) {
        boolean no=false;
        Scanner in=new Scanner(System.in);
        String nums= in.nextLine();
        String[] numArr1 = nums.split(" *(,|=>| ) *");
        long even1=0;
        for(int i=0;i<numArr1.length;i++){
              if(Integer.parseInt(numArr1[i])%2==0){
                even1+=Integer.parseInt(numArr1[i]);
                no=true;
            } 
        }
        if(no)
        {
        System.out.print(even1);
        }
        if(!no)
        {
            System.out.println(0);
        }
                            

        }
    }
    

