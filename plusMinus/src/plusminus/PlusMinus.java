/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusminus;

import java.util.Scanner;

/**
 *
 * @author norahalshaikhmubarak
 */
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

    double sumPos=0;
    double sumNeg=0;
    double sumZero=0;
    double result; 

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                sumPos+=1;
            }
            else if(arr[i]<0)
            {
                sumNeg+=1;
            }
            else if(arr[i]==0)
            {
                sumZero+=1;
            }
        }

        result=sumPos+sumNeg+sumZero;

        System.out.println(sumPos/result);
        System.out.println(sumNeg/result);
        System.out.println(sumZero/result);

    }
    

    private static final Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
        
        
    }
    
    
    
}
