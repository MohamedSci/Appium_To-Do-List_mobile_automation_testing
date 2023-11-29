package org.example.Pages;

import io.appium.java_client.*;
import org.example.tests.*;
import org.openqa.selenium.*;
public class HomePage extends AppTest {

    WebElement fab = driver.findElement(AppiumBy.id("com.jeffprod.todo:id/fab"));

    public WebElement getFab() {
        return fab;
    }
}
