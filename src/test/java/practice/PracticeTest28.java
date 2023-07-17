package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PracticeTest28 {


    public static void main(String[] args) {

        convertCsvToJson();
    }

    public static String convertCsvToJson() {

        BufferedReader br;
        List<String> lineList = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("C:\\Users\\01979D744\\Documents\\FST2023\\FST-Selenium-Java\\src\\test\\resources/file.csv"));
            String line = br.readLine();
            while(line!=null) {
                lineList.add(line);
                line = br.readLine();
            }

        }catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println(lineList);

        Map<String, String> map = new HashMap<>();
        for(String w : lineList) {
            String s[] = w.split(",");
            map.put(s[0], s[1]);
        }
        System.out.println(map);

        return null;

    }

}

