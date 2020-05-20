/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubset;

import java.util.Scanner;

public class MaxSubset {

    static int maxSubsetSum(String[] arr) {
        
        if (arr.length == 1) 
        return Integer.parseInt(arr[0]);
        
        int[] Max = new int[arr.length];
        Max[0] = Integer.parseInt(arr[0]);
        Max[1] = Math.max(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        
        for (int i = 2; i < arr.length; i++) 
        {
            Max[i]= Math.max(Max[i-1],Max[i-2]+Integer.parseInt(arr[i]));
        }
        return Max[arr.length-1];
    }
 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        String [] arr = nums.split("\\s+");
        System.out.println(maxSubsetSum(arr));
    }
}
