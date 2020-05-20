
import java.util.*;

public class soccer {

    public static class team {

        String name;
        int totalPoints = 0;
        int noWin = 0;
        int noLoss = 0;
        int noDraw = 0;
        int awayAGoals = 0;
        int homeAGoals = 0;
        int awayBGoals = 0;
        int homeBGoals = 0;
        int awayCGoals = 0;
        int homeCGoals = 0;
        int awayDGoals = 0;
        int homeDGoals = 0;
        int goalsScored = 0;
        int goalsRecvied = 0;
        int diffGoal = 0;
        String rankSimilar;
    }
   static Map<Character, team> teams = new HashMap<Character, team>();
   
   boolean perCompare(team a, team b){
    if(a.totalPoints != b.totalPoints)
        return a.totalPoints > b.totalPoints;
    
    //Second Rule
    if(a.name == "A"){
        if(b.name == "B"){
            if(a.awayBGoals+a.homeBGoals != b.awayAGoals+b.homeAGoals)
                return a.awayBGoals+a.homeBGoals > b.awayAGoals+b.homeAGoals;
        }
        if(b.name == "C"){
            if(a.awayCGoals+a.homeCGoals != b.awayAGoals+b.homeAGoals)
                return a.awayCGoals+a.homeCGoals > b.awayAGoals+b.homeAGoals;
        }
        if(b.name == "D"){
            if(a.awayDGoals+a.homeDGoals != b.awayAGoals+b.homeAGoals)
                return a.awayDGoals+a.homeDGoals > b.awayAGoals+b.homeAGoals;
        }
    }
    if(a.name == "B"){
        if(b.name == "A"){
            if(a.awayAGoals+a.homeAGoals != b.awayBGoals+b.homeBGoals)
                return a.awayAGoals+a.homeAGoals > b.awayBGoals+b.homeBGoals;
        }
        if(b.name == "C"){
            if(a.awayCGoals+a.homeCGoals != b.awayBGoals+b.homeBGoals)
                return a.awayCGoals+a.homeCGoals > b.awayBGoals+b.homeBGoals;
        }
        if(b.name == "D"){
            if(a.awayDGoals+a.homeDGoals != b.awayBGoals+b.homeBGoals)
                return a.awayDGoals+a.homeDGoals > b.awayBGoals+b.homeBGoals;
        }
    }
    if(a.name == "C"){
        if(b.name == "A"){
            if(a.awayAGoals+a.homeAGoals != b.awayCGoals+b.homeCGoals)
                return a.awayAGoals+a.homeAGoals > b.awayCGoals+b.homeCGoals;
        }
        if(b.name == "B"){
            if(a.awayBGoals+a.homeBGoals != b.awayCGoals+b.homeCGoals)
                return a.awayBGoals+a.homeBGoals > b.awayCGoals+b.homeCGoals;
        }
        if(b.name == "D"){
            if(a.awayDGoals+a.homeDGoals != b.awayCGoals+b.homeCGoals)
                return a.awayDGoals+a.homeDGoals > b.awayCGoals+b.homeCGoals;
        }
    }
    if(a.name == "D"){
        if(b.name == "A"){
            if(a.awayAGoals+a.homeAGoals != b.awayDGoals+b.homeDGoals)
                return a.awayAGoals+a.homeAGoals > b.awayDGoals+b.homeDGoals;
        }
        if(b.name == "B"){
            if(a.awayBGoals+a.homeBGoals != b.awayDGoals+b.homeDGoals)
                return a.awayBGoals+a.homeBGoals > b.awayDGoals+b.homeDGoals;
        }
        if(b.name == "C"){
            if(a.awayCGoals+a.homeCGoals != b.awayDGoals+b.homeDGoals)
                return a.awayCGoals+a.homeCGoals > b.awayDGoals+b.homeDGoals;
        }
    }
    //Third Rule
    if(a.name == "A"){
        if(b.name == "B"){
            if(a.awayBGoals!= b.awayAGoals)
                return a.awayBGoals > b.awayAGoals;
        }
        if(b.name == "C"){
            if(a.awayCGoals != b.awayAGoals)
                return a.awayCGoals > b.awayAGoals;
        }
        if(b.name == "D"){
            if(a.awayDGoals != b.awayAGoals)
                return a.awayDGoals > b.awayAGoals;
        }
    }
    if(a.name == "B"){
        if(b.name == "A01"){
            if(a.awayAGoals != b.awayBGoals)
                return a.awayAGoals > b.awayBGoals;
        }
        if(b.name == "C"){
            if(a.awayCGoals != b.awayBGoals)
                return a.awayCGoals > b.awayBGoals;
        }
        if(b.name == "D"){
            if(a.awayDGoals != b.awayBGoals)
                return a.awayDGoals > b.awayBGoals;
        }
    }
    if(a.name == "C"){
        if(b.name == "A"){
            if(a.awayAGoals != b.awayCGoals)
                return a.awayAGoals > b.awayCGoals;
        }
        if(b.name == "B"){
            if(a.awayBGoals != b.awayCGoals)
                return a.awayBGoals > b.awayCGoals;
        }
        if(b.name == "D"){
            if(a.awayDGoals != b.awayCGoals)
                return a.awayDGoals > b.awayCGoals;
        }
    }
    if(a.name == "D"){
        if(b.name == "A"){
            if(a.awayAGoals != b.awayDGoals)
                return a.awayAGoals > b.awayDGoals;
        }
        if(b.name == "B"){
            if(a.awayBGoals != b.awayDGoals)
                return a.awayBGoals > b.awayDGoals;
        }
        if(b.name == "C"){
            if(a.awayCGoals != b.awayDGoals)
                return a.awayCGoals > b.awayDGoals;
        }
    }
    //Fourth Rule
    if(a.diffGoal != b.diffGoal)
        return a.diffGoal > b.diffGoal;
    
    //Fifth Rule
    if(a.goalsScored != b.goalsScored)
        return a.goalsScored > b.goalsScored;

    return false;
}
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        team[] Teams = new team[4];
        team teamA = new team();
        team teamB = new team();
        team teamC = new team();
        team teamD = new team();
        teamA.name = "A";
        teamB.name = "B";
        teamC.name = "C";
        teamD.name = "D";

        char team1, team2;
        int score1, score2;
        for (int i = 0; i < 12; i++) {
            System.out.println("Case: " + i);
            //Team 1  -> Home
            //Team 2  -> Away
            team1 = in.next().charAt(i);
            score1 = in.nextInt();
            team2 = in.next().charAt(i);
            score2 = in.nextInt();
            //Update the total points
            if (score1 > score2) {
                System.out.println(team1 + " is the winner & " + team2 + " is the loser.");
                
                teams.get(team1).totalPoints += 3;
                teams.get(team1).noWin++;
                teams.get(team2).noLoss++;
                switch (team1) {
                    case 'A':
                        teams.get('A').goalsScored += score1;
                        teams.get('A').goalsRecvied += score2;
                        if (team2 == 'B') {
                            teams.get('A').homeBGoals += score1;
                            teams.get('B').awayAGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('A').homeCGoals += score1;
                            teams.get('C').awayAGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('A').homeDGoals += score1;
                            teams.get('D').awayAGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;

                    case 'B':
                        teams.get('B').goalsScored += score1;
                        teams.get('B').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('B').homeAGoals += score1;
                            teams.get('A').awayBGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('B').homeCGoals += score1;
                            teams.get('C').awayBGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('B').homeDGoals += score1;
                            teams.get('D').awayBGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;
                    case 'C':
                        teams.get('C').goalsScored += score1;
                        teams.get('C').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('C').homeAGoals += score1;
                            teams.get('A').awayCGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'B') {
                            teams.get('C').homeBGoals += score1;
                            teams.get('B').awayCGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('C').homeDGoals += score1;
                            teams.get('D').awayCGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;
                    case 'D':
                        teams.get('D').goalsScored += score1;
                        teams.get('D').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('D').homeAGoals += score1;
                            teams.get('A').awayDGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('D').homeCGoals += score1;
                            teams.get('C').awayDGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'B') {
                            teams.get('D').homeBGoals += score1;
                            teams.get('B').awayDGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        break;
                }
            } else if (score1 < score2) {
                System.out.println(team2 + " is the winner & " + team1 + " is the loser.");
                teams.get(team2).totalPoints += 3;
                teams.get(team2).noWin++;
                teams.get(team1).noLoss++;
                //Updating the goals of team 1 & team 2
                switch (team1) {
                    case 'A':
                        teams.get('A').goalsScored += score1;
                        teams.get('A').goalsRecvied += score2;
                        if (team2 == 'B') {
                            teams.get('A').homeBGoals += score1;
                            teams.get('B').awayAGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('A').homeCGoals += score1;
                            teams.get('C').awayAGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('A').homeDGoals += score1;
                            teams.get('D').awayAGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;

                    case 'B':
                        teams.get('B').goalsScored += score1;
                        teams.get('B').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('B').homeAGoals += score1;
                            teams.get('A').awayBGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('B').homeCGoals += score1;
                            teams.get('C').awayBGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('B').homeDGoals += score1;
                            teams.get('D').awayBGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;
                    case 'C':
                        teams.get('C').goalsScored += score1;
                        teams.get('C').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('C').homeAGoals += score1;
                            teams.get('A').awayCGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'B') {
                            teams.get('C').homeBGoals += score1;
                            teams.get('B').awayCGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('C').homeDGoals += score1;
                            teams.get('D').awayCGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;
                    case 'D':
                        teams.get('D').goalsScored += score1;
                        teams.get('D').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('D').homeAGoals += score1;
                            teams.get('A').awayDGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('D').homeCGoals += score1;
                            teams.get('C').awayDGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'B') {
                            teams.get('D').homeBGoals += score1;
                            teams.get('B').awayDGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        break;
                }
            } else {
                System.out.println("It is a tie");
                teams.get(team1).totalPoints += 1;
                teams.get(team1).noDraw++;
                teams.get(team2).totalPoints += 1;
                teams.get(team2).noDraw++;
                //Updating the goals of team 1 & team 2
                switch (team1) {
                    case 'A':
                        teams.get('A').goalsScored += score1;
                        teams.get('A').goalsRecvied += score2;
                        if (team2 == 'B') {
                            teams.get('A').homeBGoals += score1;
                            teams.get('B').awayAGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('A').homeCGoals += score1;
                            teams.get('C').awayAGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('A').homeDGoals += score1;
                            teams.get('D').awayAGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;

                    case 'B':
                        teams.get('B').goalsScored += score1;
                        teams.get('B').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('B').homeAGoals += score1;
                            teams.get('A').awayBGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('B').homeCGoals += score1;
                            teams.get('C').awayBGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('B').homeDGoals += score1;
                            teams.get('D').awayBGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;
                    case 'C':
                        teams.get('C').goalsScored += score1;
                        teams.get('C').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('C').homeAGoals += score1;
                            teams.get('A').awayCGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'B') {
                            teams.get('C').homeBGoals += score1;
                            teams.get('B').awayCGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        if (team2 == 'D') {
                            teams.get('C').homeDGoals += score1;
                            teams.get('D').awayCGoals += score2;
                            teams.get('D').goalsScored += score2;
                            teams.get('D').goalsRecvied += score1;
                        }
                        break;
                    case 'D':
                        teams.get('D').goalsScored += score1;
                        teams.get('D').goalsRecvied += score2;
                        if (team2 == 'A') {
                            teams.get('D').homeAGoals += score1;
                            teams.get('A').awayDGoals += score2;
                            teams.get('A').goalsScored += score2;
                            teams.get('A').goalsRecvied += score1;
                        }
                        if (team2 == 'C') {
                            teams.get('D').homeCGoals += score1;
                            teams.get('C').awayDGoals += score2;
                            teams.get('C').goalsScored += score2;
                            teams.get('C').goalsRecvied += score1;
                        }
                        if (team2 == 'B') {
                            teams.get('D').homeBGoals += score1;
                            teams.get('B').awayDGoals += score2;
                            teams.get('B').goalsScored += score2;
                            teams.get('B').goalsRecvied += score1;
                        }
                        break;
                }
            }
        }
        teams.get('A').diffGoal = teams.get('A').goalsScored - teams.get('A').goalsRecvied;
        teams.get('B').diffGoal = teams.get('B').goalsScored - teams.get('B').goalsRecvied;
        teams.get('C').diffGoal = teams.get('C').goalsScored - teams.get('C').goalsRecvied;
        teams.get('D').diffGoal = teams.get('D').goalsScored - teams.get('D').goalsRecvied;
        teams.get('A').name = "A";
        teams.get('B').name = "B";
        teams.get('C').name = "C";
        teams.get('D').name = "D";
        Teams[0] = teams. put('A', teams.get('A'));
        Teams[1] = teams. put('B', teams.get('B'));
        Teams[2] = teams. put('C', teams.get('C'));
        Teams[3] = teams. put('D', teams.get('D'));
        //sort(Teams, Teams + 4, perCompare);
        System.out.println(Teams[0].name +" "+Teams[0].rankSimilar);
        System.out.println(Teams[1].name +" "+Teams[1].rankSimilar);
        System.out.println(Teams[2].name +" "+Teams[2].rankSimilar);
        System.out.println(Teams[3].name +" "+Teams[3].rankSimilar);
        //Rank Sorting
        System.out.println("Let's check the rank");

    }
}
