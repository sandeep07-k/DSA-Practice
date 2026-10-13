import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of row: ");
        int m = sc.nextInt();
        System.out.print("enter the number of column: ");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == m / 2 + 1 || j == (n / 2) + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
