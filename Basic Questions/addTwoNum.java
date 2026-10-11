// Addition Of Two Numbers
import java.util.Scanner;

public class addTwoNum {
   public static int addNum(int num1, int num2){
     int sum= num1+ num2;
     return sum;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        
        System.out.println("The Addition of "+n1+ " and "+n2+": "+ addNum(n1,n2));
    }
}
