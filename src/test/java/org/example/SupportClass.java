package org.example;

import org.openqa.selenium.*;

import java.io.*;
import java.nio.file.*;

public class SupportClass {

    public WebElement writeToElement(WebElement we, String str){
         we.click();
         we.clear();
         we.sendKeys(str);
         return we;
    }
    public void takeElementsScreenshot(WebDriver driver, String SsName) {
        Path filePath = Paths.get("./ScreenShot",SsName +".png");
        try {
            Files.createDirectories(filePath.getParent());
            FileOutputStream out = new FileOutputStream(filePath.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        }catch(Exception e) {
            System.out.println("Exception takeElementsScreenshot "+e.getMessage());
        }
    }

}
