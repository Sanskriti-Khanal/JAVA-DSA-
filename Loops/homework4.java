package Loops;

import java.util.*;

public class homework4 {
    public static void main(String[] args) {
        /*
         * BONUS
         * Qs. Print if a number is prime or not (Input n from the user).
         * [In this problem you will learn how to check if a number is prime or not]
         * 
         * Prime numbers are numbers that have only 2 factors: 1 and themselves.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;

        } else {
            for (int i = 2; i <= num / 2; i++) {/* jaba samma i <= num taba samma loop runs */
                if (num % i == 0) {
                    isPrime = false;
                }

            }
        }
        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not prime number");
        }

        /*
         * Initial Setup:
         * 
         * num = 12
         * isPrime = true
         * The loop runs from i = 2 to i = num / 2 = 12 / 2 = 6, so i takes values: 2,
         * 3, 4, 5, 6.
         * Loop Iteration 1 (i = 2):
         * 
         * Check: 12 % 2 == 0 → true (12 is divisible by 2).
         * Since it's divisible, set isPrime = false.
         * Loop Iteration 2 (i = 3):
         * 
         * Check: 12 % 3 == 0 → true (12 is divisible by 3).
         * isPrime is already false, so no change.
         * Loop Iteration 3 (i = 4):
         * 
         * Check: 12 % 4 == 0 → true (12 is divisible by 4).
         * isPrime remains false.
         * Loop Iteration 4 (i = 5):
         * 
         * Check: 12 % 5 == 0 → false (12 is not divisible by 5).
         * No change, isPrime = false.
         * Loop Iteration 5 (i = 6):
         * 
         * Check: 12 % 6 == 0 → true (12 is divisible by 6).
         * isPrime remains false.
         */
    }

}
