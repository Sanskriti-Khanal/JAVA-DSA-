package MAXMINARRAY;

//Given an array of integers, find the second maximum and second minimum array
public class secondminmax {
    public static void main(String[] args) {

        int[] arr = { -5, 2, 4, 6, 10, 34, 88 };

        if (arr.length < 2) {
            System.out.println("Array needs at least two elements.");
            return;
        }

        int secondMin = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                secondMin = arr[i];
                break;
            }
        }

        int secondMax = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondMax = arr[i];
                break;
            }
        }

        // Output results
        if (secondMin == -1) {
            System.out.println("No second minimum value.");
        } else {
            System.out.println("Second Minimum element: " + secondMin);
        }

        if (secondMax == -1) {
            System.out.println("No second maximum value.");
        } else {
            System.out.println("Second Maximum element: " + secondMax);
        }
    }
}
