//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Find the difference between Greatest and Smallest elements of the Array
package practice;
import java.util.Arrays;
import java.util.Scanner;
public class PracticeTest5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrlength = scan.nextInt();

        int arr[] = new int[arrlength];

        System.out.println("Enter " + arrlength + " array elements");
        for(int i=0; i<arrlength; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array Elements Before Sorting:\n"+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Array Elements After Sorting:\n"+Arrays.toString(arr));

        int difference = arr[arr.length-1] - arr[0];
        System.out.println("Difference between the greatest and the smallest is " + difference);

        scan.close();
    }

}
