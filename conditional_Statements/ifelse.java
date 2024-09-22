package conditional_Statements;
// conditional statement gives condition

// if(condition){
// }
// else{}
import java.util.*;

public class ifelse {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // can vote or note
            int age = sc.nextInt();
            if (age > 10) {
                System.out.println("Can vote");
            } else {
                System.out.println("Can't Vote");
            }
            // odd or even
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            // check greater equal to
            // else if situation
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Equal");
            } else if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
            // print namaste in button 1, hello in button 2 and bonjour in button 3

            int button = sc.nextInt();
            if (button > 3) {
                System.out.println("Invalid Button");
            } else if (button == 1) {
                System.out.println("Namaste");
            } else if (button == 2) {
                System.out.println("Namaste");
            } else {
                System.out.println("Bonjour");
            }
        }

    }
}
