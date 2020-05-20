/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraysum;
/**
 *
 * @author norahalshaikhmubarak
 */
import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             sum = sum+(sc.nextInt());
        }
        System.out.println(sum);
    }
}
