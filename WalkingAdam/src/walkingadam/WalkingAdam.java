/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingadam;

import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class WalkingAdam {

    static String x;
    static int sum1=0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        
        for(int i=0;i<y;i++)
        {
            x = s.next();
        }
        
        for(int j=0;j<y;j++)
        {
            if(x.equals('D'))
                System.out.println("zero");   
            
            else if(x.equals('U'))
               sum1+=1;
        }
        System.out.println(sum1);
        
    }
}
