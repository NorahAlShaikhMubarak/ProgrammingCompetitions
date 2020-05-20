/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int c=0;
        Scanner s = new Scanner(System.in);

        int y1 = s.nextInt();             
        int y2 = s.nextInt();
        if(y1<y2)
        {
            for(int i=y1;i<y2;i++)
            {
                int r=i;
                if((r % 400 == 0) || ((r % 4 == 0) && (r % 100 != 0)))           
                {
                    c++;
                }

           }  
            System.out.println(c);
        }
        else
        {
            System.out.println("not leap year");
    }
}
}

