import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        //UC1
        System.out.println("welcome to the palindrome checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");
        //UC2
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
        //UC3
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversed = reversed + str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not palindrome");

        }
        //UC54
        char[] character = str.toCharArray();
        int start = 0;
        int end = character.length - 1;
        while(start < end) {
            if (character[start] != character[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;

        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }

}