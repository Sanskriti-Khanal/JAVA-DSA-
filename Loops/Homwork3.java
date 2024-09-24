package Loops;

import java.util.*;;

public class Homwork3 {
    public static void main(String[] args) {
        /*
         * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
         * If the user enters 1 then keep taking input from the user for a student’s
         * marks(out of 100).
         * If they enter 0 then stop.
         * If he/ she scores :
         * Marks >=90 -> print “This is Good”
         * 89 >= Marks >= 60 -> print “This is also Good”
         * 59 >= Marks >= 0 -> print “This is Good as well”
         * Because marks don’t matter but our effort does.
         * (Hint : use do-while loop but think & understand why)
         * 
         */
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the mark: ");
            int Mark = sc.nextInt();
            if (Mark >= 90) {
                System.out.println("This is Good.");
            } else if (Mark >= 60) {
                System.out.println("This is also Good");
            } else {
                System.out.println("This is Good as well Because marks don’t matter but our effort does.");

            }
            System.out.println("Do you still want to continue? If yes press 1 if no than press 0");
            choice = sc.nextInt();

        } while (choice == 1);
        {
            System.out.println("Program Stopped");

        }

    }

}
