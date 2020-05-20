/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicnumber;

/**
 *
 * @author norahalshaikhmubarak
 */
import java.util.Scanner;
public class MagicNumber {

 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
         long n=sc.nextLong();
         long num= n;
         long x;
	 boolean isPrime = true;
         long rev=0;
         long temp=n;
         long r;
         long sum=0;
         
         while(num>0){    
         r=num%10;   
         sum=(sum*10)+r;    
         num=num/10;    
        }    
         
        for(int i=2;i<=num/2;i++)
	{
           x=num%i;
	   if(x==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
       
        if(isPrime&&temp==sum)
	   System.out.println(true);
        else
       {
         System.out.println(false);
       }
    }
}
