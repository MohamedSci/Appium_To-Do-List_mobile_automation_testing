package org.example;

import org.example.tests.*;
import org.openqa.selenium.*;
import org.openqa.selenium.io.*;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.io.*;
import java.util.*;
public class ScreenShotClass extends AppTest {

    // A function to take Screenshot
    public  void getPageScreenshot(String path_screenshot, String filename) throws IOException{
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(path_screenshot + filename +".jpg");
        FileHandler.copy(srcFile,targetFile);
    }

    // Image comparison in java

}
