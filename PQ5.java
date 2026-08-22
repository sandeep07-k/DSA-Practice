// To find Armstrong Number between two given number.
import java.util.Scanner;

public class PQ5 {
    public static boolean isArmstrong(int num) {
        if(num<0){
            return false;
        }
        // storing original number
        int originalNum = num;

        // counting of digits of num
        int power=0;
        int temp=num;
        while(temp>0){
            temp=temp/10;
            power++;
        }

        // sum of each digit to the raised power of "digits"
        int sum=0;
        int tempN=num;
        while(tempN>0){
            int digit=tempN%10;
            sum=sum + (int) Math.pow(digit,power);
            tempN=tempN/10;
        }
        return sum==originalNum;

    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the second number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between "+start+ " and "+ end+":");
        for(int i= start;i<=end;i++)
        {
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        sc.close();
    }
    
}
