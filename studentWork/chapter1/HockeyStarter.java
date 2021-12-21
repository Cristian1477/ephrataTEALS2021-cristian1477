
import java.util.*;

public class HockeyStarter {

    public static void main(String[] args) {
        
        int periodsPlayed = 3;
        String team = "Oiler";
        System.out.println(TotalGoals(team, periodsPlayed));


    }

        public static String TotalGoals(String teamName, int periods) {
            
            int sum = 0;
            double average = 0.0;
            for(int i=1; i<=periods; i++){
                Scanner hstat = new Scanner(System.in);
                System.out.println("The " + teamName + " score how many goals at the end of the " + i + " period?");
                int value = hstat.nextInt();
                sum = sum + value;
                average = sum/(double)periods;
            }

            return "the " + teamName + " periods of play they have " + sum + " goals and an average of " + average + " goals per period.";
        
    } 
}