/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumma;
import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class Jumma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int j = 0;
        int sum = 0;
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
            j=s.nextInt();
        }
        
        int c=40;
       for(int x=j;x<=4;x++)
       {
         sum+=c*j;  
       }
        System.out.println(sum);

}
}
