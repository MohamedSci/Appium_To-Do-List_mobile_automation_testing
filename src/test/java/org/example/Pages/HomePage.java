package org.example.Pages;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import org.example.tests.*;
import org.openqa.selenium.*;
public class HomePage extends AppTest {



    public WebElement getFab() {
        System.out.printf("HomePage getFab The getDriver( Session Id %s%n", driver.getSessionId());
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/fab"));
    }
}
