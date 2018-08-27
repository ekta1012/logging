package executionEngine;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excelRead {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    public static void main(String args[]) throws Exception {
        FileInputStream ExcelFile = new FileInputStream("C:\\Users\\abc\\IdeaProjects\\logging\\src\\dataEngine\\Book2.xlsx");
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet("Sheet1");
        /*
        getFirstRowNum :if sheet not contain rows  it will return -1.
        int a=ExcelWSheet.getFirstRowNum();
         */
       /* Gets the index of the last cell contained in this row PLUS ONE
        int a=ExcelWSheet.getLastRowNum();
        */
       /*
       gets the total rows that have data in anywhere in sheet

       int a=ExcelWSheet.getPhysicalNumberOfRows();
     System.out.println(a);*/
        //int a=ExcelWSheet.getFirstRowNum(); //0
        //int b=ExcelWSheet.getLastRowNum();

        //Row row1 = c.getLastCellNum();   //Gets the index of the last cell contained in this row PLUS ONE.
        int c = ExcelWSheet.getLastRowNum() - ExcelWSheet.getFirstRowNum();


        for (int i = 0; i < c + 1; i++) {
            Row row = ExcelWSheet.getRow(i);

            for (int j = 0; j < row.getLastCellNum(); j++) {
                Cell s = row.getCell(j);
                    try{
                    switch (s.getCellTypeEnum()) {

                        case STRING: {
                            System.out.print(row.getCell(j).getStringCellValue());
                            System.out.print("    ");
                            break;
                        }
                        case NUMERIC: {
                            System.out.print(row.getCell(j).getNumericCellValue());
                            System.out.print("    ");
                            break;
                        }
                        default:
                            System.out.print("invalid value");
                            break;
                    }
                    }
                    //case BLANK: {

                   catch(NullPointerException e){
                        System.out.println("Exception is" + e.getMessage());
                    }


                     System.out.println("");




                       /*
                       if(s == null)
                        for(Cell cell : row) {
                        // Skip empty cells
                            if (row == null) {
                                continue;
                            }
                            System.out.println("-");
                         */








            }
        }
    }
}
