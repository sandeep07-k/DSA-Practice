// To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class PQ4 {
    public static boolean isPalindrome(String str){

        if(str== null){
            return false;
        }
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if(isPalindrome(input.toLowerCase())){
            System.out.println("\""+ input+ "\" is a Palindrome.");
        
        }
        else{
            System.out.println("\""+ input+ "\" is not a Palindrome.");
        }
        sc.close();
    }
}

// public class PalindromeBuiltIn {

//     public static boolean isPalindrome(String str) {
//         if (str == null) return false;
        
//         String reversed = new StringBuilder(str).reverse().toString();
//         return str.equalsIgnoreCase(reversed);
//     }

//     public static void main(String[] args) {
//         String str = "Racecar";
//         System.out.println(str + " is palindrome: " + isPalindrome(str));
//     }
// }

 