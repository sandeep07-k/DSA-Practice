// Input a number and print all the factors of that number
import java.util.Scanner;

public class factors {

    public static void calFactors(int num) {
        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        System.out.print("Factors of " + num + ": ");

        // Loop up to num / 2 to find proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }

        // The number itself is always a factors
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        // Call the void method directly
        calFactors(input);

        sc.close();
    }
}