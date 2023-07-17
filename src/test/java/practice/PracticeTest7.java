//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Java Program To check the given number is Armstrong number or not e.g.153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
package practice;
import java.util.Scanner;
public class PracticeTest7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Armstrong number or not:\t");
        int num = scan.nextInt();

        int sumOfCubes = 0;
        int temp = num;
        int digit = 0;

        while(num>0) {
            digit = num % 10;
            sumOfCubes = sumOfCubes + digit*digit*digit;
            num = num/10;
        }

        if(temp==sumOfCubes) {
            System.out.println(temp + " is Armstrong number");
        }else {
            System.out.println(temp + " is not Armstrong number");
        }

        scan.close();

    }

}

