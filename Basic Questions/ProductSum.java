// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class ProductSum
{   
    public static int calculate(int num){
        
        // product of digits
        int temp=num;
        int product =1;
        while(temp>0){
            int digit = temp%10;
            product = product * digit;
            temp=temp/10;
        }
       

        // sum of digits
        int sum=0;
        int temp2=num;
        while(temp2>0){
            int digit= temp2%10;
            sum=sum + digit;
            temp2=temp2/10;
        }
      
        // Subtracting Sum from Product of digits
        if(sum>product){
            int ans =sum-product;
            return ans;
        }else{
            int ans =product-sum;
            return ans;
        }
    
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int input = sc.nextInt();
        System.out.println("The Substraction of sum and product of digits: "+ calculate(input));
    }
}