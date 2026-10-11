
// Find the largest element in an array.
import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 5, 20, 50, 27, 89, 34, 10, 955, 5555 };
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("largest elemst:" + large);
    }
}
