package conditional_Statements;

import java.util.Scanner;

//Lecture 3

public class homework {
    // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
    // follows :
    // 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the
    // user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();

        System.out.println("Enter your second number");
        int b = sc.nextInt();

        System.out.println("Enter your operator (+, -, x, /, %):");
        sc.nextLine();
        String operator = sc.nextLine();

        switch (operator) {
            case "+":
                int sum = a + b;
                System.out.println(" a " + " + " + " b " + " = " + sum);
                break;
            case "-":
                int sub = a - b;
                System.out.println(" a " + " - " + " b " + " = " + sub);
                break;
            case "x":
                int mul = a * b;
                System.out.println(" a " + " x " + " b " + " = " + mul);
                break;
            case "/":
                if (a == 0) {
                    System.out.println("0 is not divisible");
                } else {
                    float div = a / b;
                    System.out.println(" a " + " / " + " b " + " = " + div);
                }
                break;
            case "%":
                float modulo = a % b;
                System.out.println(" a " + " % " + " b " + " = " + modulo);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }

        // Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Decekber");
                break;

            default:
                System.out.println("There are only 12 months");
                break;

        }

    }

}
