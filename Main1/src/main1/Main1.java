/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner s= new Scanner(System.in);
        
        num1=s.nextInt();
        num2=s.nextInt();
        
        int dist1;
        int dist2;
        
        dist1=(num2-300);
        dist2=(300-num1);
        
        int AddOfDist;
        AddOfDist=(dist1+dist2);
        
        System.out.println(AddOfDist);

    }
    
}
