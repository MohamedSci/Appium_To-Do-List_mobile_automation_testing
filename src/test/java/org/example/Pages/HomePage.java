package org.example.Pages;

import io.appium.java_client.*;
import org.example.tests.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.*;
import java.util.*;
import java.util.concurrent.*;

public class HomePage extends AppTest {

    public WebElement getFab() {
//        wait= new WebDriverWait(driver, Duration.ofDays(TimeUnit.SECONDS.toSeconds(10)));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.jeffprod.todo:id/fab")));
        System.out.printf("HomePage getFab The getDriver( Session Id %s%n", driver.getSessionId());
        return driver.findElement(AppiumBy.id("com.jeffprod.todo:id/fab"));
    }
    public List<WebElement> getALlPagesCheckBoxes() {
//        wait = new WebDriverWait(driver, Duration.ofDays(TimeUnit.SECONDS.toSeconds(10)));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.jeffprod.todo:id/checkBoxListView")));
        System.out.printf("HomePage getFab The getDriver( Session Id %s%n", driver.getSessionId());
        return driver.findElements(AppiumBy.id("com.jeffprod.todo:id/checkBoxListView"));
    }
}
