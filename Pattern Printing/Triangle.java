
import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print((char) (j + 64) + " ");
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
