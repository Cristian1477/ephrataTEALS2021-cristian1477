
import java.util.Scanner;

public class NestedMultiples {

    public static void main(String[] args) {
        /* print out a grid of multiplicaton tables
              col1  col2    col3    col4    col5
        row1: 1     2       3       4       5
        row2: 2     4       6       8       10
        row3: 3     6       9       12      15
        */

        
        // Enter a prompt for the size of the Multiplication Table



        // Scanner for the size variable


        // Nested for loop for the rows and columns
        
            
        // Println for the line break
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number: ");
        int size = console.nextInt();
        for( int row = 1; row <= size; row++){
            for( int col = 1; col <=size; col++){
                int product = row * col;
                System.out.print(product + "\t");
            }
            System.out.println();
        }    
        
    }


    
}