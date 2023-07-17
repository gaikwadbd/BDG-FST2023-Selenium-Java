package examples;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class B3PassingExcelDataBase {


    @Test()
    //Import the data::row start at 3 and column at 1:
    public static void imortingData () throws IOException, IOException {

        FileInputStream file=new         FileInputStream("C://Users//01979D744//Documents//FST2023//FST-Selenium-Java//src//test//resources//sample.xlsx");
        XSSFWorkbook book=new XSSFWorkbook(file);
        XSSFSheet sheet=book.getSheet("Sheet1");

        int rowNum=sheet.getLastRowNum();
        System.out.println(rowNum);

        //get the row and value and assigned to variable to use in application
        for (int r=3;r<rowNum;r++) {

            // Rows stays same but column num changes and this is for only one person. It iterate for other.
            XSSFRow currentRow=sheet.getRow(r);

            String fName=currentRow.getCell(1).toString();
            String lName=currentRow.getCell(2).toString();
            String phone=currentRow.getCell(3).toString();
            String email=currentRow.getCell(4).toString();

            //passing the data
            System.out.println(fName);
            System.out.println(lName);
        }

    }

}