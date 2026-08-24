// Reverse A String In Java
import java.util.Scanner;

public class ReverseString {
    public static String revString(String str){
        if (str==null) return null;

        char[] chars= str.toCharArray();
        int left=0;
        int right = chars.length-1;

        while (left < right){
            char temp = chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;

        }
        return new String(chars);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in );

        System.out.print("Enter the String: ");
        String strr= sc.next();
        System.out.println("Reversed String: "+revString(strr));
    }
}
