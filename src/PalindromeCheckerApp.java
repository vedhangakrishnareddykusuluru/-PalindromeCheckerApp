import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("welcome to the palindrome checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check whether it is palindrome or not : ");
        String str = sc.nextLine();
        boolean isPalindrome = true;

        for(int i = 0; i<str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() -1 -i)){
                isPalindrome =false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
