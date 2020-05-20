/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntonicseq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class NtonicSeq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int arr[]={2,4,6,8};
        if(arr.length <= 2)
        {
            System.out.println("mono");
        }
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i=1; i<arr.length; i++){
          if (arr[i-1] > arr[i]){
            increasing = false;
        } 
          else if(arr[i-1] < arr[i]) 
        {
            decreasing = false;
        }
        if (!increasing && !decreasing)
        {
            break;
        }
    }
    
}
}
