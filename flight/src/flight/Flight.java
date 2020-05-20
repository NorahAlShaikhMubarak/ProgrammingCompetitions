/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class Flight {
    
        public static int sub(int hh, int zone)
    {
        for (int i = 0; i < zone; i++) {
            if(hh==00)
            {
                hh=23;
            }
            else
            {
                hh--;
            }
            
        }
        return hh;
    }
    
        public static int add(int hh, int zone)
    {
        for (int i = 0; i < zone; i++) {
            if(hh==23)
            {
                hh=00;
            }
            else
            {
                hh++;
            }
        }
        return hh;
    }
    
     public static int diffH(int hh1,int hh2,int mm1, int mm2)
     {
         int diff =0;
         if(hh1!=hh2 || hh1==hh2&&mm1<=mm2)
         {

         while (hh1!=hh2){
      
                 if(hh1==23)
                     hh1=00;
                 else
                     hh1++;
                 
                   diff++;     
         }
         }
         else
         {
             do{
                 if(hh1==23)
                     hh1=00;
                 else
                     hh1++;
                 
                   diff++; 
             }while(hh1!=hh2);
             diff--;
             
         }

         return diff; 
       
    }
     
         public static int diffM(int mm1, int mm2){
         int diff =0;
        

         while (mm1!=mm2){
      
                 if(mm1==59)
                     mm1=00;
                 else
                     mm1++;
                 
                   diff++;     
         }
         return diff;
       
    } 

    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter out= new PrintWriter("output.txt");
        Scanner in= new Scanner(new FileReader("input.txt"));
        
        int t=in.nextInt();
        for (int i = 1; i <=t; i++) {
            String takeOfTime = in.next();
            String takeOfZone= in.next();
            String landingTime = in.next();
            String landingZone= in.next();
            
            int hh1 = Integer.parseInt(takeOfTime.substring(0,2));
             //System.out.print(hh1 + ": ");
             int mm1 = Integer.parseInt(takeOfTime.substring(3));
             //System.out.print(mm1 + "\t");
             
             int hh2 = Integer.parseInt(landingTime.substring(0,2));
            //System.out.print(hh2 + ": ");
             int mm2 = Integer.parseInt(landingTime.substring(3));
            //System.out.println(mm2);
            
            
             //----------TakeofZone----------------------// 
            if(takeOfZone.charAt(0)=='+'){
                int zone= Integer.parseInt(takeOfZone.substring(1, 3));
               hh1= sub(hh1,zone);
            }
            else{
                int zone= Integer.parseInt(takeOfZone.substring(1, 3));
                hh1=add(hh1,zone);  
            }
            
            
            
           //----------LandingZone----------------------//
             if(landingZone.charAt(0)=='+'){
                int zone2= Integer.parseInt(landingZone.substring(1, 3));
                hh2=sub(hh2,zone2);
            }
            else{
                int zone2= Integer.parseInt(landingZone.substring(1, 3));
                hh2= add(hh2,zone2);  
            }
            System.out.print(hh1 + ": "); System.out.print(mm1 + "\t");
            System.out.print(hh2 + ": "); System.out.println(mm2);
            out.print(i +". ");
            out.printf("%d:%02d",diffH(hh1,hh2,mm1,mm2),diffM(mm1,mm2));
            out.println(); 
        }
        out.close();
        
    }

}
