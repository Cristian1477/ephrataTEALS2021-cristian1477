import java.util.Scanner;
import java.util.Random;

public class CoinGame {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int money = 100;
        int bet = 0;
        int x = 0;
        String user = ".";
        String coin = ".";
        while(x<5){
            x++;
            System.out.println("Please bet an amount between $1 and " + money);
            bet= console.nextInt();
            System.out.println("Choose either heads or tails.");
            user = console.next().toLowerCase();
            int n = rand.nextInt(2);
            if(n==0){
                coin="heads";
            } else{
                coin = "tails";
            }
            System.out.println("It was " + coin);
            if (coin.equals(user)){
                money += bet;

            } else{
                money -= bet;
            }
            if(money <= 0){
                x = 5;
                System.out.print("GAME OVER,You lost all your money :( ");
            }
            System.out.println(money);
            if (x==5){
                if(money >= 200){
                    System.out.println("Congratulations, you won :) ");

                } else{
                    System.out.println("You lost, better luck next time");
                }
            }
        }
    }
}