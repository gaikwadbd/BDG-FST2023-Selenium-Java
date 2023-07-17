//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Remove the duplicate elements from list
package practice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class PracticeTest8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");

        String str = "";
        List<String> list = new ArrayList<String>();

        while(!str.equals("*")) {
            str = scan.next();
            if(!str.equals("*")) {
                list.add(str);
            }
        }
        System.out.println("The Elements in List are:"+ list);

        //If they ask you to remove duplicate elements from a collection tell them I convert
        //the collection to set
        Set<String> listSet = new HashSet<>(list);

        System.out.println("After removing Duplicates Elements in List are:"+ listSet);

        scan.close();

    }

}

