package examples;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReadAndWriteInList {
    public static ArrayList<ArrayList<String>> ReadExel(String excelFile){
        boolean debug=true;
        ArrayList<ArrayList<String>> OUT = new ArrayList<ArrayList<String>>();
        File myFile = new File(excelFile);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(myFile);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Finds the workbook instance for XLSX file
        XSSFWorkbook myWorkBook = null;
        try {
            myWorkBook = new XSSFWorkbook (fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Return first sheet from the XLSX workbook
        XSSFSheet mySheet = myWorkBook.getSheetAt(0);

        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();

        // Traversing over each row of XLSX file
        int count=1;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            ArrayList<String> InnerArray = new ArrayList<String>() ;
            if(debug)System.out.print(count + ". \t");
            // For each row, iterate through each columns
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                switch (cell.getCellType()) {
                    case STRING:
                        String c = cell.getStringCellValue();
                        if(debug)System.out.print(c + "\t\t");
                        InnerArray.add(c);
                        break;
                    case NUMERIC:
                        int n = (int) cell.getNumericCellValue();
                        if(debug)System.out.print(n + "\t\t");
                        InnerArray.add(String.valueOf(n));
                        break;
                    case BOOLEAN:
                        boolean b = cell.getBooleanCellValue();
                        if(debug)System.out.print(b + "\t");
                        InnerArray.add(String.valueOf(b));
                        break;
                    default :
                }
            }

            if(debug)System.out.println("");
            OUT.add(InnerArray);
            count++;
        }

        return OUT;
    }

    public static void main(String[] args) {
        ReadExel("C://Users//01979D744//Documents//FST2023//FST-Selenium-Java//src//test//resources//sample.xlsx");
    }
}
