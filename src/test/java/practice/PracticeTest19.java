//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Longest Palindrome String
package practice;

public class PracticeTest19 {
   	/*
	 	Find the longest palindrome in a String
	 */

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("abxxbmcd");

        StringBuilder revStr = new StringBuilder("abxxbmcd");

        revStr.reverse();


        for(int i=0; i<revStr.length(); i++){

            if(str.charAt(i) != revStr.charAt(i)){

                revStr.replace(i,i+1,"");
                i--;
            }
        }

        System.out.println(revStr);

    }

}

