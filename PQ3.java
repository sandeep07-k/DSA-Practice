// To calculate Fibonacci Series up to n numbers. 0,1,1,2,3,5,8,13,21......
import java.util.Scanner;
public class PQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int prev=0;
        int next=1;
        System.out.print("Fibonacci Series Upto "+ n+": 0,1,");
        for(int i=1;i<=n-2;i++){
            
            int sum = prev+next;
            System.out.print(sum+",");
            prev= next;
            next=sum;
            
        }
        System.out.print("....");


    }
}
