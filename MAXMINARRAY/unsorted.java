package MAXMINARRAY;

//Write a program to find maximum and minimum elements in unsorted array
public class unsorted {
    public static void main(String[] args) {

        int[] arr = { 10, 2, 34, -5, 88, 6, 4 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
