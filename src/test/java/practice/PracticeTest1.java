//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Java Program reverse the given tree using loop and reverse function
package practice;
import java.util.Scanner;

public class PracticeTest1 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to reverse:\t");
        String str = scan.nextLine();

        //1.Way: By using StringBuilder()
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        System.out.println("Using String Reverse Function :"+strB.reverse());

        String revStr = "";
        //2.Way: By using String Class
        for(int i=str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Using For Loop :"+ revStr);

        //3.Way: Create a method then call the method from main method
        System.out.println("Using Reverse Function:" + revStr(str));

    }

    public static String revStr(String str) {
        String revStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            revStr = revStr + str.charAt(i);
        }
        return revStr;
    }
}