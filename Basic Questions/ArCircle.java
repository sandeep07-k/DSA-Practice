// Area of Circle
import java.util.Scanner;
public class ArCircle {
   
    public static int CircleArea(int radius){
        int area = (int) 3.14*radius*radius;
        return area;
    }
    public static int Perimeter(int radius){
        double peri=  2*3.14*radius;
        return (int)peri;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int input = sc.nextInt();
        System.out.println("The area of circle: "+CircleArea(input)+ " sq.unit");
        System.out.println("The perimeter of circle: "+Perimeter(input)+" unit");

    }

}
