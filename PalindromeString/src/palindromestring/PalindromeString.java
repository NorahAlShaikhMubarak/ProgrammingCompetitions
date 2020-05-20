/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromestring;

import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class PalindromeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String str=s.next();
        StringBuilder sb=new StringBuilder(str);
        
        String rev=String.valueOf(sb.reverse());
        
        if(rev.equals(str))
        {
            System.out.println(str+" is Palindrome");

        }
        else
        {
            System.out.println(str+" not palindrome");
        }
    
}
}