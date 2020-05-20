/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;
/**
 *
 * @author norahalshaikhmubarak
 */
public class LCS {

    public static void main(String args[]){
        String arbitrary_string1 = "ARSDCSFOGMLKMIUOONP";
        String arbitrary_string2 = "GHCLPPOEWMHGFMDSOXZN";

        String lcs = getLCS(arbitrary_string1, arbitrary_string2);
        System.out.println("LCS of " + arbitrary_string1 + " and "+ arbitrary_string2+ " is:");
        System.out.println(lcs);
        System.out.println("Length:"+lcs.length());
    }
    public static String getLCS(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        
        // Building DP solution to calculate the lenght of LCS
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } 
                else 
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // Traversing through the DP solution to find the actual LCS
        // based on the table computed with DP
        int x = len1, y = len2;
        String lcs = "";
        while (x > 0 && y > 0) {
            if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
                lcs = String.valueOf(str1.charAt(x - 1)) + lcs;
                x--;
                y--;
            } else if (dp[x - 1][y] > dp[x][y - 1]) {
                x--;
            } else {
                y--;
            }
        }
        return lcs;
    }

}