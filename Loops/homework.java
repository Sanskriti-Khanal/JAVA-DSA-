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

    }

}
