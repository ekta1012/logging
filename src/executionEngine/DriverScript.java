package executionEngine;
import config.ActionsKeywords;
import utility.ExcelUtils;

public class DriverScript{
    public static void main(String[] args) throws Exception {
        // Declaring the path of the Excel file with the name of the Excel file
        String sPath = "C:\\Users\\abc\\IdeaProjects\\logging\\src\\dataEngine\\Book2.xlsx";

        // Here we are passing the Excel path and SheetName as arguments to connect with Excel file
        ExcelUtils.setExcelFile(sPath, "Test Steps");

        //Hard coded values are used for Excel row & columns for now
        //In later chapters we will replace these hard coded values with varibales
        //This is the loop for reading the values of the column 3 (Action Keyword) row by row
        for (int iRow=1;iRow<=6;iRow++){
            //Storing the value of excel cell in sActionKeyword string variable
            String sActionKeyword = ExcelUtils.getCellData(iRow, 3);
            //Comparing the value of Excel cell with all the project keywords
            if(sActionKeyword.equals("initiate_Browser")){
                //This will execute if the excel cell value is 'openBrowser'
                //Action Keyword is called here to perform action
                ActionsKeywords.initiate_Browser();}
            else if(sActionKeyword.equals("open_URL")){
                ActionsKeywords.open_URL();}

            else if(sActionKeyword.equals("input_username")){
                ActionsKeywords.input_username();}

            else if(sActionKeyword.equals("input_pwd")){
                ActionsKeywords.input_pwd();}

            else if(sActionKeyword.equals("click_Button")){
                ActionsKeywords.click_Button();
                }
            else if(sActionKeyword.equals("close")){
                ActionsKeywords.close();
            }
        }
    }
 }