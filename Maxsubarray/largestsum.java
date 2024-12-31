package Maxsubarray;

//solve the maximum subarray problem(kandane's Algorithm):FInd the contigious subarray with largest sum
public class largestsum {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("Maximum subarray sum is: " + maxSoFar);
    }
}
