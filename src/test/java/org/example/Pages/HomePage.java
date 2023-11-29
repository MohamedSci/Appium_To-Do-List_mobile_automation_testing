package org.example.Pages;

import io.appium.java_client.*;
import org.example.tests.*;
import org.openqa.selenium.*;
public class HomePage extends AppTest {

public HomePage (){
    super();
}

    public WebElement getFab() {
        System.out.printf("HomePage getFab The driver Session Id %s%n", super.driver.getSessionId());
        return super.driver.findElement(AppiumBy.id("com.jeffprod.todo:id/fab"));
    }
}
