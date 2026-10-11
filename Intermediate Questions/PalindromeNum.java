
// Find if a number is palindrome or not
import java.util.*;

public class PalindromeNum {
    static void CalPalindrome(int num) {
        int original = num;
        int digit, reverse = 0;

        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();
        CalPalindrome(num);
        sc.close();
    }
}
