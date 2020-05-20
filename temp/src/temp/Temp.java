/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.util.Scanner;


public class Temp {

    public static void main(String[] args) {
        
      int sum = 0;
      int even = 0;
      int odd = 1;
      Scanner in = new Scanner(System.in);
      String nums = in.nextLine(); 
      String nums2 = in.nextLine();

        String[] numArr = nums.split("\\s+");   
        String[] numArr2 = nums2.split("\\s+");
     
        
        if (even<numArr.length && Integer.parseInt(numArr[even])% 2 == 0){
            even += 2;
            if(odd<numArr.length && Integer.parseInt(numArr[odd])% 2 == 1) {
                odd += 2;
            } 
        }
        
        if (even<numArr.length && odd<numArr.length){
            String temp = numArr[even];
            numArr[even]=numArr[odd];
            numArr[odd] = temp;
        }
        else{
            for (int i = 0; i < numArr.length; i++) {
                if(i != 0 && i!=numArr.length-1){
                sum += Integer.parseInt(numArr[i]);
                }
            }
           
        }
       
        if (even<numArr2.length && Integer.parseInt(numArr2[even])% 2 == 0){
            even += 2;
            if(odd<numArr2.length && Integer.parseInt(numArr2[odd])% 2 == 1) {
                odd += 2;
            } 
        }
        
        if (even<numArr2.length && odd<numArr2.length){
            String temp = numArr2[even];
            numArr2[even]=numArr2[odd];
            numArr2[odd] = temp;
            System.out.println("No Ideal");
        }
        else{
             for (int i = 0; i < numArr2.length; i++) {
                 if(i != 0 && i!=numArr.length-1){
                sum += Integer.parseInt(numArr2[i]);
                 }
            }
             System.out.println(sum);
        }
}
}
