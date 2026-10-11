// Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static long calFactorial(int n){
        if(n<0){
            System.out.print("Factorial is undefined for Negative Numbers.");
        }
    

        long result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number to find factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+": "+calFactorial(num));
    }

}
