package Loops;

import java.util.Scanner;

//lecture 4
public class Question {
    public static void main(String[] args) {
        // Print the sum of First n Natural Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("The sum is " + sum);

        // Print the table of a number input by the user
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            int mul = num * i;
            System.out.println(num + " x " + i + " = " + mul);

        }

    }

}
