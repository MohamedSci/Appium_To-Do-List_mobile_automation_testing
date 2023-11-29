package org.example.tests;

import com.opencsv.*;
import org.example.*;
import org.example.Pages.*;
import org.testng.annotations.*;

import java.io.*;

public class AddTaskTest extends AppTest{

    SupportClass sc = new SupportClass();
    HomePage homePage = new HomePage();
    AddTaskPage taskPage = new AddTaskPage();

    CSVReader reader;
    String titStr, noteStr, tagStr;
    String[] csvCell;
    // CSVReader reader ;
    // get path of CSV file
    String CSV_file = System.getProperty("user.dir") + "/src/test/java/org/example/data/note_appium.csv";

    public void FileReaderFun() {
        try {
            CSVReader _reader = new CSVReader(new FileReader(CSV_file));
            reader = _reader;
        } catch (Exception e) {
            System.out.println("Exception $e");
        }
    }
    @Test
    public void addTaskTest() throws IOException {
        FileReaderFun();
        while ((csvCell = reader.readNext()) != null) {
            titStr = csvCell[0];
            noteStr = csvCell[1];
            tagStr = csvCell[2];
            homePage.getFab().click();
            sc.writeToElement(taskPage.getTitIn(), titStr);
            sc.writeToElement(taskPage.getNoteIn(), noteStr);
            taskPage.getEditTag().click();
            taskPage.getEl5().click();
            sc.writeToElement(taskPage.getTagIn(), tagStr);
            taskPage.getButton1().click();
            taskPage.getButtonStartDate().click();
            taskPage.getNextMonth().click();
            taskPage.getStartDayChosen().click();
            taskPage.getButton1().click();
            taskPage.getButtonDeadline().click();
            taskPage.getEl13().click();
            taskPage.getDate_picker_header_year().click();
            taskPage.getYearChosen().click();
            taskPage.getNextMonth().click();
            taskPage.getEndDayChosen().click();
            taskPage.getButton1().click();
            taskPage.getEditTextPriority().click();
            taskPage.getMediumPriority().click();
            taskPage.getButton1().click();
            taskPage.getAction_save().click();
        }

    }


}
