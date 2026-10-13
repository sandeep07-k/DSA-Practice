
// Find the second-largest distinct element.
import java.util.Arrays;

public class SecondLargest {
   public static void main(String[] args) {
      int[] arr = { 23, 55, 65, 87, 34, 54, 36, 98, 50, 89, 567, 555, 567, 555, 565, 565, 565, 456 };
      int n = arr.length;

      // using sorting
      Arrays.sort(arr);
      int secLarge = 0;

      for (int i = n - 2; i >= 0; i--) {
         if (arr[i] != arr[n - 1]) {
            secLarge = arr[i];
            break;
         }
      }

      System.out.println("Second Largest: " + secLarge);

      // without sort
      int largest = arr[0];
      int Slargest = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i] > largest) {
            Slargest = largest;
            largest = arr[i];
         } else if (arr[i] > Slargest && arr[i] != largest) {
            Slargest = arr[i];
         }
      }

      System.out.println("Second Largest: " + Slargest);

      

   }

}
