/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npcarray6;

import java.util.Scanner;


public class NPCArray6 {

   
    public static void main(String[] args) {
        boolean no=false;
        Scanner in=new Scanner(System.in);
        String nums= in.nextLine();
        String[] numArr = nums.split("\\s+");
        long max = 0;
        long index = 0;
        for(int i=0;i<numArr.length;i++){
            if(Integer.parseInt(numArr[i])>max){
                if(Integer.parseInt(numArr[i])%2==0){
                max = Integer.parseInt(numArr[i]);
		index = i;
            }
            }
        }   
             System.out.println((int)Math.pow(max, index));

    }
}
