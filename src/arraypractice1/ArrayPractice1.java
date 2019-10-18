/**
 * Ben Clark
 * Oct 18 2019
 * Asks the user for 20 numbers and then adds them all together and displays final sum
 */

package arraypractice1;
import java.util.Scanner;


public class ArrayPractice1 {
    

    public static void main(String[] args) {
        //Creates a scanner object
               Scanner keyedInput = new Scanner (System.in);
        //Declare our array and number of slots
        int [ ] numbers = new int [20];
        int total = 0;
        //Asks for numbers to be entered
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        //Adds all entered numbers together
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        //Displays the final total of the previouse entered numbers
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
