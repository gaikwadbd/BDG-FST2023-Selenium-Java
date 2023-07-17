//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Java Program To check the given string is Palindrome or not
package practice;
import java.util.Scanner;
public class PracticeTest6 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to check if it is palindrome or not:\n");
        String str = scan.nextLine().replace(" ","").toLowerCase();

        isPalindrome(str);

        scan.close();
    }

    public static void isPalindrome(String str) {

        String revStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        if(str.equals(revStr)) {
            System.out.println(str + " is Palindrome");
        }else {
            System.out.println(str + " is not Palindrome");
        }

    }

}

