package org.example.Pages;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import org.example.tests.*;
import org.openqa.selenium.*;

public class AddTaskPage extends AppTest {



    public WebElement getTitIn() {
        System.out.printf("AddTaskPage getTitIn The super.getDriver( Session Id %s%n",
                driver.getSessionId());
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextTitre"));
    }

    public WebElement getNoteIn() {
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextNote"));
    }

    public WebElement getEditTag() {
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextTag"));
    }

    public WebElement getEl5() {
        return driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Work\"]"));
    }

    public WebElement getTagIn() {
        return driver.findElement(AppiumBy.className("android.widget.EditText"));
    }

    public WebElement getButton1() {
        return driver.findElement(AppiumBy.id("android:id/button1"));
    }

    public WebElement getButtonStartDate() {
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/buttonStartDate"));
    }

    public WebElement getNextMonth() {
        return driver.findElement(AppiumBy.accessibilityId("Next month"));
    }

    public WebElement getStartDayChosen() {
        return driver.findElement(AppiumBy.accessibilityId("03 December 2023"));
    }

    public WebElement getButtonDeadline() {
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/buttonDeadline"));
    }

    public WebElement getEl13() {
        return driver.findElement(AppiumBy.id("android:id/date_picker_header_date"));
    }

    public WebElement getDate_picker_header_year() {
        return driver.findElement(AppiumBy.id("android:id/date_picker_header_year"));
    }

    public WebElement getYearChosen() {
        return driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"2024\"]"));
    }

    public WebElement getEndDayChosen() {
        return driver.findElement(AppiumBy.accessibilityId("01 January 2025"));
    }

    public WebElement getEditTextPriority() {
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/editTextPriority"));
    }

    public WebElement getMediumPriority() {
        return driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Medium\"]"));
    }

    public WebElement getAction_save() {
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/action_save"));
    }



}
