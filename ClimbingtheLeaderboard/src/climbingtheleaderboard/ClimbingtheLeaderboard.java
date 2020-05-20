/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingtheleaderboard;

import java.util.Scanner;
/**
 *
 * @author norahalshaikhmubarak
 */
public class ClimbingtheLeaderboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final int players = in.nextInt();
        int scores[] = new int [players];
        int rank = 2 ;
        int score;

        scores[0] = in.nextInt();

        for (int i = 1, j = 1; i < players; ++i) {
            score = in.nextInt();
            if(score != scores[j - 1]){
                scores[j] = score;
                ++rank;
                ++j;

            }
        }
        int games = in.nextInt();
        while (games-- > 0){

            score = in.nextInt();
            for (; rank > 1 ; ){
                if (scores[rank - 2] > score){
                    break;
                }else {
                    --rank;
                }
            }
            System.out.println(rank);
        }

    }
    
}
