//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description:Put All zeros at the end of Array
package practice;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeTest17 {
	/*
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:\n");
        int length = scan.nextInt();
        System.out.println("Enter the array elements:\n");
        int[] arr = new int[length];

        for(int i=0; i<length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] brr = new int[length];
        int idx = 0;

        for(int i=0; i<length; i++) {
            if(arr[i]!=0) {
                brr[idx] = arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(brr));

    }

}
