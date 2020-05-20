
package twostrings;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

    static int MAX_CHAR = 26; 
     
      
    static boolean twoStrings(String s1, String s2)  
    { 
        
        boolean vector[]=new boolean[MAX_CHAR]; 
        Arrays.fill(vector,false); 
      
        for (int i = 0; i < s1.length(); i++) 
            vector[s1.charAt(i) - 'a'] = true; 
          
           for (int i = 0; i < s2.length(); i++)  
             if (vector[s2.charAt(i) - 'a'])  
             return true; 
          
        return false; 
        
        
    }
   
    public static void main(String[] args) {
       
            Scanner s1=new Scanner(System.in);
            String str1=s1.next();
            Scanner s2=new Scanner(System.in);
            String str2=s1.next();    
         
              if (twoStrings(str1, str2)) 
              System.out.println("Yes"); 
              else
              System.out.println("No");        
             
    }
      
    
}
