package org.example;

import org.openqa.selenium.*;

public class SupportClass {

    public WebElement writeToElement(WebElement we, String str){
         we.click();
         we.clear();
         we.sendKeys(str);
         return we;
    }


}
