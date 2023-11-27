package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.io.*;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.io.*;
import java.util.*;
public class ScreenShotClass extends LandingPageTest{

    // A function to take Screenshot
    public void getPageScreenshot(String path_screenshot) throws IOException{
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        String filename= UUID.randomUUID().toString();
        File targetFile=new File(path_screenshot + filename +".jpg");
        FileHandler.copy(srcFile,targetFile);
    }

    // Image comparison in java

}
