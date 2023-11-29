package org.example.Pages;

import io.appium.java_client.*;
import org.example.tests.*;
import org.openqa.selenium.*;

public class AddTaskPage extends AppTest {

    public WebElement getTitIn() {
        return titIn;
    }

    public WebElement getNoteIn() {
        return noteIn;
    }

    public WebElement getEditTag() {
        return editTag;
    }

    public WebElement getEl5() {
        return el5;
    }

    public WebElement getTagIn() {
        return tagIn;
    }

    public WebElement getButton1() {
        return button1;
    }

    public WebElement getButtonStartDate() {
        return buttonStartDate;
    }

    public WebElement getNextMonth() {
        return nextMonth;
    }

    public WebElement getStartDayChosen() {
        return startDayChosen;
    }

    public WebElement getButtonDeadline() {
        return buttonDeadline;
    }

    public WebElement getEl13() {
        return el13;
    }

    public WebElement getDate_picker_header_year() {
        return date_picker_header_year;
    }

    public WebElement getYearChosen() {
        return yearChosen;
    }

    public WebElement getEndDayChosen() {
        return endDayChosen;
    }

    public WebElement getEditTextPriority() {
        return editTextPriority;
    }

    public WebElement getMediumPriority() {
        return mediumPriority;
    }

    public WebElement getAction_save() {
        return action_save;
    }

    WebElement titIn = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextTitre"));
    WebElement noteIn = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextNote"));
    WebElement editTag = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextTag"));
    WebElement el5 = driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Work\"]"));
    WebElement tagIn = driver.findElement(AppiumBy.className("android.widget.EditText"));
    WebElement button1 = driver.findElement(AppiumBy.id("android:id/button1"));
    WebElement buttonStartDate = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/buttonStartDate"));
    WebElement nextMonth = driver.findElement(AppiumBy.accessibilityId("Next month"));
    WebElement startDayChosen = driver.findElement(AppiumBy.accessibilityId("03 December 2023"));
    WebElement buttonDeadline = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/buttonDeadline"));
    WebElement el13 = driver.findElement(AppiumBy.id("android:id/date_picker_header_date"));
    WebElement date_picker_header_year = driver.findElement(AppiumBy.id("android:id/date_picker_header_year"));
    WebElement yearChosen = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"2024\"]"));
    WebElement endDayChosen = driver.findElement(AppiumBy.accessibilityId("01 January 2025"));
    WebElement editTextPriority = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextPriority"));
    WebElement mediumPriority = driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Medium\"]"));
    WebElement action_save = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/action_save"));





}
