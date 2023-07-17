package examples;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;


public class ReadExcel {

        public static void main(String[] args) throws Exception {
            String filename = "C://Users//01979D744//Documents//FST2023//FST-Selenium-Java//src//test//resources//sample.xlsx";

            try (FileInputStream fis = new FileInputStream(filename)) {
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                //XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);

                Iterator rows = sheet.rowIterator();
                while (rows.hasNext()) {
                    XSSFRow row = (XSSFRow) rows.next();
                    Iterator cells = row.cellIterator();
                    while (cells.hasNext()) {
                        XSSFCell cell = (XSSFCell) cells.next();

                        CellType type = cell.getCellType();
                        if (type == CellType.STRING) {
                            System.out.println("[" + cell.getRowIndex() + ", "
                                    + cell.getColumnIndex() + "] = STRING; Value = "
                                    + cell.getRichStringCellValue().toString());
                        } else if (type == CellType.NUMERIC) {
                            System.out.println("[" + cell.getRowIndex() + ", "
                                    + cell.getColumnIndex() + "] = NUMERIC; Value = "
                                    + cell.getRawValue());

                            //  System.out.println("[" + cell.getRowIndex() + ", "
                            //      + cell.getColumnIndex() + "] = NUMERIC; Value = "
                            //     + cell.getNumericCellValue());
                        } else if (type == CellType.BOOLEAN) {
                            System.out.println("[" + cell.getRowIndex() + ", "
                                    + cell.getColumnIndex() + "] = BOOLEAN; Value = "
                                    + cell.getBooleanCellValue());
                        } else if (type == CellType.BLANK) {
                            System.out.println("[" + cell.getRowIndex() + ", "
                                    + cell.getColumnIndex() + "] = BLANK CELL");
                        }
                        else if (type == CellType.FORMULA) {
                            System.out.println("[" + cell.getRowIndex() + ", "
                                    + cell.getColumnIndex() + "] = BLANK CELL");
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }





