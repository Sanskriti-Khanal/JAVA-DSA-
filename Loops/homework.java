package Loops;

import java.util.*;

public class homework {
    public static void main(String[] args) {
        /* Print all even numbers till n. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        /*
         * Run
         * for(; ;) {
         * System.out.println("Hello world");
         * }
         * loop on your system and analyze what happens. Try to think of the reason for
         * the output produced.
         * 
         * 
         * The loop runs forever because there's no condition to stop it.
         */

    }

}
