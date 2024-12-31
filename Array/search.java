package Array;

public class search {

    public static void main(String[] args) {

        int[] vooc = { 100, 200, 300, 400 };

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

    }
}
