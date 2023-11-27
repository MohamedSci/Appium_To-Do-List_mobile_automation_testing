package org.example;

import org.apache.commons.io.*;
import org.openqa.selenium.*;
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
        FileUtils.copyFile(srcFile,targetFile);
    }

    // Image comparison in java
    public static boolean imagesEquals(Bitmap bitmap1, Bitmap bitmap2) {
        ByteBuffer buffer1 = ByteBuffer.allocate(bitmap1.getHeight() * bitmap1.getRowBytes());
        bitmap1.copyPixelsToBuffer(buffer1);
        ByteBuffer buffer2 = ByteBuffer.allocate(bitmap2.getHeight() * bitmap2.getRowBytes());
        bitmap2.copyPixelsToBuffer(buffer2);
        return Arrays.equals(buffer1.array(), buffer2.array());
    }


// Create Bitmap
    Bitmap bitmap1 = BitmapFactory.decodeFile("/path/to/screeshot/screenshot.jpg");
    Bitmap bitmap2 = BitmapFactory.decodeFile("/path/to/image_that_will_be_compared/assertionImage.jpg");

    //Compare the two images and return the result
    boolean areImagesEqual = MobilUtils.imagesEquals(mBitmap1, mBitmap2);

}
