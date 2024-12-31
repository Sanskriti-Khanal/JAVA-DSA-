package Array;

public class insertion {
    public static void main(String[] args) {
        int[] vooc = { 100, 200, 300, 400 };

        int[] newVooc = new int[vooc.length + 1];
        System.arraycopy(vooc, 0, newVooc, 0, vooc.length);
        newVooc[vooc.length] = 500;

        System.out.print("After insertion of 500: ");
        for (int i : newVooc) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
