//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Check Given Number is Prime or not
package practice;
import java.util.Scanner;
public class PracticeTest4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int number = scan.nextInt();
        primeCalculator(number);
        scan.close();

    }

    public static void primeCalculator(int number) {
        int count = 0;
        if(number>0) {
            if (number == 1) {
                System.out.println(number + " is prime number");
            }else {
                for(int i=2; i<number; i++) {
                    if(number%i==0) {
                        count++;
                    }
                }
                if(count==0) {
                    System.out.println(number + " is prime");
                }else {
                    System.out.println(number + " is not prime");
                }
            }
        }else {
            System.out.println("Enter a positive integer");
        }

    }

}

