package Task;

class factorial {
    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int number = 4; // The number to calculate the factorial for
        int result = factorial(number); // Call the factorial method
        System.out.println("The factorial of " + number + " is " + result);
    }
}
