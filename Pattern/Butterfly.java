package Pattern;

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
public class Butterfly {
    public static void main(String[] args) {
        // Upper half
        for (int i = 1; i <= 5; i++) {
            // First part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (5 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // lower half
        for (int i = 5; i >= 1; i--) {
            // First part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (5 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Second Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
