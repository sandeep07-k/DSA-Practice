// Calculate Average Of N Numbers
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total count of numbers (N): ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.print("N should be positive integer.");
            sc.close();
            return;
        }

        double sum=0;
        System.out.print("Enter "+n+" numbers: ");
        for(int i = 1;i<=n;i++){
            System.out.print("Number " + i + ": ");
            sum += sc.nextDouble();
        }

        double average= sum/n;
        System.out.printf("Sum = %.2f\n", sum);
        System.out.printf("Average = %.2f\n", average);

        sc.close();
    }
}
