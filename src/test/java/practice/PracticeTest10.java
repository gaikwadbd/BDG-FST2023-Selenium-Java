//Auther :Bharat G FST Batch May 2023
//Date:01/06/2023
//Description: Count The words in given sentence

package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PracticeTest10 {

    public static void main(String[] args) {

        String str = "Krishna came to school, and Radha came to school, and Krishna came to school";
        String words[] = str.split(" ");
        System.out.println(Arrays.toString(words));

        List<String> wordsList = new ArrayList<String>();
        for(String w : words) {
            wordsList.add(w.replaceAll("\\W", ""));
        }
        System.out.println(wordsList);

        Map<String, Integer> numOfWords = new HashMap<>();// {                                   }

        for(String w : wordsList) {

            if(numOfWords.containsKey(w)) {

                numOfWords.put(w, numOfWords.get(w)+1);

            }else {

                numOfWords.put(w,1);

            }
        }
        System.out.println(numOfWords);

    }
}

