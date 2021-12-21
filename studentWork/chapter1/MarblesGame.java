import java.util.Scanner;
import java.util.Random;

public class MarblesGame {
    public static void main(String[] args){
        String Game = "hello";
        Scanner console = new Scanner(System.in);
        System.out.println("Choose what you want to play: Rock,Paper,Scissors or marbles");
       Game = console.next().toLowerCase() ;
       if(Game.equals("marbles")){
        Marblesgame();
       }
       else{
           Rockpaperscissors();
       }
    
    System.out.println("Thank you for playing :)");
    }
    public static void Marblesgame(){
        String play = "e" ;
        while(!play.equals("quit")){
            Random rand = new Random();
            int marbles = 0;
            int UserChoice1 = 0;
            int chance = 0;
            int x = 0 ;
           int difficulty = 0 ;
           Scanner console = new Scanner(System.in);
           String UserDifficulty = "e" ;
            System.out.println("Choose the difficulty: easy, medium or hard") ;
            UserDifficulty = console.next().toLowerCase() ;
            if(UserDifficulty.equals("easy")){
                    marbles = rand.nextInt(11);
                    difficulty = 3;
                    chance = 10 ;
                }
                else if(UserDifficulty.equals("medium")){
                    marbles = rand.nextInt(101);
                    difficulty = 6;
                    chance = 100 ;
                }
            if(UserDifficulty.equals("hard")){
                    marbles = rand.nextInt(1001);
                    difficulty = 9;
                    chance = 1000;
                }
                //System.out.println(marbles);
                System.out.println("you choose the " + UserDifficulty + " difficulty you will have to gues how many marbles i have between 0 and " + chance + " you have");
                System.out.println(difficulty + " tries to guess how many marbles i have Goodluck :)");
            while(x < difficulty){
                x++;
                System.out.println("Guess how many marbles i have");
                UserChoice1 = console.nextInt();
                if(!(difficulty == x)){
                System.out.println("Wrong answer, try again");
                System.out.println("you have " + (difficulty - x) + " tries left");
                }
                if(!UserDifficulty.equals("easy")){
                System.out.println("you were " + (marbles - UserChoice1) + " off");
                }
                if(difficulty == x && !(UserChoice1 == marbles)){
                    System.out.println("You lost, better luck next time.");
                }
                System.out.println(UserChoice1);
                if(UserChoice1 == marbles){
                    x = difficulty;
                    System.out.println("Congratulations you won");
                }   
            }
            System.out.println("Put quit to end the game");
            play = console.next().toLowerCase();
        }
    }
    public static void Rockpaperscissors(){
        String play = "e";
        while(!play.equals("quit")){
         Scanner console = new Scanner(System.in);
         String user = "";
         System.out.println("Choose Rock, Paper or Scissors");
          user = console.next().toLowerCase();
          System.out.println(user);
         Random rand = new Random();
         int n = rand.nextInt(3);
         String Comp = ".";
         if (n == 0) {
              Comp = "rock";
         } else if (n == 1){
              Comp = "paper";
         }else {
              Comp = "scissors";
         }
         //System.out.println(Comp);
         if (user.equals("rock")) {
             if (Comp.equals("paper") ){
                 System.out.println("You lose.");
             } else if(Comp.equals("scissors") ){
                 System.out.println("you win");
             }else if (Comp.equals("rock") ){
                 System.out.println("it's a tie.");
             }
         }
         if (user.equals("paper")){
             if(Comp.equals("scissors")){
                 System.out.println("You lose.");
             }else if(Comp.equals("rock") ){
                 System.out.println("you win");
             }else if (Comp.equals("paper")){
                 System.out.println("it's a tie.");
             }
         }
         if (user.equals("scissors")){
              if(Comp.equals("rock")){
                 System.out.println("You lose.");
             }else if(Comp.equals("paper") ){
                 System.out.println("you win");
             }else if (Comp.equals("scissors")){
                 System.out.println("it's a tie.");
             }
         }
         System.out.println("Put quit to end the game");
         play = console.next().toLowerCase();
     }
    }
}
