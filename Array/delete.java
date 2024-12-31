package Array;

public class delete {
    public static void main(String[] args) {
        int[] vooc = { 100, 200, 300, 400, 100 };
        int deleteValue = 100;

        int count = 0;
        for (int i = 0; i < vooc.length; i++) {
            if (vooc[i] != deleteValue) {
                count++;
            }
        }

        int[] newArrayAfterDeletion = new int[count];

        int index = 0;
        for (int i = 0; i < vooc.length; i++) {
            if (vooc[i] != deleteValue) {
                newArrayAfterDeletion[index++] = vooc[i];
            }
        }

        System.out.print("After deleting " + deleteValue + ": ");
        for (int i : newArrayAfterDeletion) {
            System.out.print(i + " ");
        }
    }
}
