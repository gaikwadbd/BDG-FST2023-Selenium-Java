//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } then create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
package practice;
import java.util.ArrayList;
import java.util.List;
public class PracticeTest14 {
    public static void main(String[] args) {
        int arrnum[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        newArray(arrnum);
    }

    public static void newArray(int arr[]) {

        List<Integer> list = new ArrayList<Integer>();
        int i = 0;

        while (i < arr.length) {
            int bas = i * (i + 1) / 2;

            int bit = (i + 1) * (i + 2) / 2;
            if (bit > arr.length) {
                break;
            }
            int sum = 0;
            for (; bas < bit; bas++) {
                sum = sum + arr[bas];
            }
            list.add(sum);
            i++;
        }
        System.out.println("The new array is "+list);
    }
}
