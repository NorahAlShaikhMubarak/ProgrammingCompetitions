
package testmax;

import java.util.Scanner;

public class TestMax {

   static int maxSubsetSum(String arr[]) 
    {  
        int max = Integer.parseInt(arr[0]);
        int sum = 0;
        int maxSum;
  
        for (int i = 1; i < arr.length; i++) 
        { 
           if(max > sum)
           {
           maxSum = max;
           }
           else 
           {
           maxSum = sum;      
           }
           
           max = sum + Integer.parseInt(arr[i]);
           sum = maxSum;
        }
         return ((max > sum) ? max : sum);
    } 
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        String [] arr = nums.split("\\s+");
        System.out.println(maxSubsetSum(arr));
      }
}
