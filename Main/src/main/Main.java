/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        double num1;
        double num2;
        Scanner s= new Scanner(System.in);
        
        num1=s.nextDouble();
        num2=s.nextDouble();
        
        double dist1;
        double dist2;
        


        dist1=(num2-300);
        dist2=(300-num1);
        
        double AddOfDist;
        AddOfDist=(dist1+dist2);
                
        System.out.println(AddOfDist);



    }
}
