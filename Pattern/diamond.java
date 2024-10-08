package Pattern;

public class diamond {
    public static void main(String[] args) {
        // upper
        for (int i = 1; i <= 4; i++) {
            // spaces
            for (int j = 1; j < 4 - i; j++) {
                System.out.print(" ");
            }
            // stars

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // lower half
        for (int i = 4; i >= 1; i--) {
            // spaces
            for (int j = 1; j < 4 - i; j++) {
                System.out.print(" ");
            }
            // stars

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
