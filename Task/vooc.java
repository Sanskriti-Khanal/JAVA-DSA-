package Task;

public class vooc {
    public static void main(String[] args) {

        int[] vooc = { 100, 200, 300, 400 };

        System.out.println("Accessing vooc[2]: " + vooc[2]);

        int searchValue = 200;
        boolean found = false;
        for (int i = 0; i < vooc.length; i++) {
            if (vooc[i] == searchValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found " + searchValue + " in the array.");
        } else {
            System.out.println(searchValue + " not found in the array.");
        }

        int[] newVooc = new int[vooc.length + 1];
        System.arraycopy(vooc, 0, newVooc, 0, vooc.length);
        newVooc[vooc.length] = 500;

        System.out.print("After insertion of 500: ");
        for (int i : newVooc) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] newArrayAfterDeletion = new int[newVooc.length - 1];
        int deleteValue = 100;
        int newIndex = 0;
        for (int i = 0; i < newVooc.length; i++) {
            if (newVooc[i] != deleteValue) {
                newArrayAfterDeletion[newIndex++] = newVooc[i];
            }
        }

        System.out.print("After deleting 100: ");
        for (int i : newArrayAfterDeletion) {
            System.out.print(i + " ");
        }
    }
}
