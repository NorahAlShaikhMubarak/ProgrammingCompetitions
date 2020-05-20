/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npcarray3;

import java.util.Scanner;

public class NPCArray3 {

    public static void main(String[] args) {
        boolean no=false;
        Scanner in=new Scanner(System.in);
        String nums= in.nextLine();
        String[] numArr = nums.split("\\s+");
        for(int i=0;i<numArr.length;i++){
              if(Integer.parseInt(numArr[i])%2!=0&&Integer.parseInt(numArr[i])%5!=0){
                    System.out.print(numArr[i]+" ");
                    no=true;
        }      
        }
        if(!no)
        {
            System.out.println(0);
        }
    }
}
