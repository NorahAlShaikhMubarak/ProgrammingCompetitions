/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validsubstring;

import java.util.Stack;

/**
 *
 * @author norahalshaikhmubarak
 */
public class ValidSubstring {

    static int findMaxLen(String str) 
    { 
        int n = str.length(); 
       
        Stack<Integer> stk = new Stack<>(); 
        stk.push(-1); 
       
        int result = 0; 
       
        for (int i=0; i<n; i++) 
        { 
            if (str.charAt(i) == '(') 
              stk.push(i); 
       
            else
            { 
                stk.pop(); 
                if (!stk.empty()) 
                    result = Math.max(result, i - stk.peek()); 
                else stk.push(i); 
            } 
        } 
       
        return result; 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        String str = "((()()"; 
        System.out.println(findMaxLen(str)); 
       
        str = "()(()))))"; 
        System.out.println(findMaxLen(str)); 
       
    } 
    
}
