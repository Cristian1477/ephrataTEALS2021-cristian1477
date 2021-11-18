
import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        int a = 2;

        if (x < 30) {
            x++;
            System.out.println("Spongebob Squarepants! " + x);
        } 
        System.out.println(a);
    }
}
