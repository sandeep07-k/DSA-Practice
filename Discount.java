// Calculate Discount Of Product
import java.util.Scanner;

public class Discount {
    public static double calDiscount(double mrp, double dis){
        if (mrp < 0 || dis < 0 || dis > 100) {
            System.out.println("Invalid MRP or Discount Percentage.");
            return 0;
        }
        double result = mrp-(mrp*dis/100);
        return result;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the MRP: ");
        double MRP = sc.nextInt();
        System.out.print("Enter the Discount percentage: ");
        double Dis = sc.nextInt();
        double price = calDiscount(MRP, Dis);
        System.out.printf("Final price after " +Dis+ " percent discount: %.2f",price);
    }
    
}
