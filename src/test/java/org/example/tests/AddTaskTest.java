package org.example.tests;

import com.opencsv.*;
import org.example.*;
import org.example.Pages.*;
import org.testng.*;
import org.testng.annotations.*;
import org.testng.asserts.*;

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
            reader = new CSVReader(new FileReader(CSV_file));
        } catch (Exception e) {
            System.out.println("Exception $e");
        }
    }
    @Test
    public void addTaskTest() throws IOException, InterruptedException {
        FileReaderFun();
        while ((csvCell = reader.readNext()) != null) {
            titStr = csvCell[0];
            noteStr = csvCell[1];
            tagStr = csvCell[2];
            Thread.sleep(2000);
            int initialTasksCount =homePage.getALlPagesCheckBoxes().size();
            System.out.printf("initialTasksCount %d \n",initialTasksCount);

            homePage.getFab().click();
            Thread.sleep(1000);
            sc.writeToElement(taskPage.getTitIn(), titStr);
            Thread.sleep(200);
            sc.writeToElement(taskPage.getNoteIn(), noteStr);
            taskPage.getEditTag().click();
            Thread.sleep(200);
            taskPage.getEl5().click();
            Thread.sleep(200);
            sc.writeToElement(taskPage.getTagIn(), tagStr);
            taskPage.getButton1().click();
            Thread.sleep(500);
            taskPage.getButtonStartDate().click();
            Thread.sleep(500);
            taskPage.getNextMonth().click();
            Thread.sleep(300);
            taskPage.getStartDayChosen().click();
            Thread.sleep(200);
            taskPage.getButton1().click();
            Thread.sleep(200);
            taskPage.getButtonDeadline().click();
            Thread.sleep(200);
            taskPage.getEl13().click();
            Thread.sleep(300);
            taskPage.getDate_picker_header_year().click();
            Thread.sleep(300);
            taskPage.getYearChosen().click();
            Thread.sleep(300);
            taskPage.getNextMonth().click();
            Thread.sleep(300);
            taskPage.getEndDayChosen().click();
            Thread.sleep(300);
            taskPage.getButton1().click();
            Thread.sleep(200);
            taskPage.getEditTextPriority().click();
            Thread.sleep(200);
            taskPage.getMediumPriority().click();
            Thread.sleep(300);
            taskPage.getButton1().click();
            Thread.sleep(200);
            taskPage.getAction_save().click();
            Thread.sleep(300);
            int endTasksCount =homePage.getALlPagesCheckBoxes().size();
            System.out.printf("endTasksCount %d \n",endTasksCount);
            softAssert.assertEquals(endTasksCount , initialTasksCount+1);
        }

    }


}
