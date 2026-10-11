import java.util.*;

public class Armstrong {
    static void Armstrong1(int num) {

        int count = 0, digit, arm = 0;
        int original = num;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        num = original;
        while (num > 0) {
            digit = num % 10;
            arm = arm + (int) Math.pow(digit, count);
            num /= 10;
        }
        if (arm == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();
        Armstrong1(num);
        sc.close();
    }
}
