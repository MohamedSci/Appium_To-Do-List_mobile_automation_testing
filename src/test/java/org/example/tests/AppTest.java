package org.example.tests;

import io.appium.java_client.android.*;
import org.example.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;

import java.io.*;
import java.net.*;
import java.time.*;

/**
 * Project Name    : first_appium_test
 * Developer       : Mohamed Said
 * Version         : 1.0.0
 * Date            : 18/11/2023
 * Time            : 11:55 AM
 * Description     :
 **/


public class AppTest {

    public AndroidDriver driver;

    public WebDriverWait wait;
    String PROJECT_ROOT = System.getProperty("user.dir");
    SupportClass supportClass = new SupportClass();
    @BeforeClass
    public void setup() throws MalformedURLException {
        String ANDROID_APK_PATH = "/src/test/resources/ToDo_1.24_Apkpure.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RF8W30AC31F");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
//        caps.setCapability("appPackage", "com.splendapps.splendo");
//        caps.setCapability("appActivity", "com.splendapps.splendo/.MainActivity");
        caps.setCapability("noReset", false);// Clears the app data, such as its cache
        caps.setCapability("fullReset", false);// ReInstall the app again
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app", new File(PROJECT_ROOT + ANDROID_APK_PATH).getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:8844/wd/hub"), caps);
        System.out.printf("The driver Session Id %s%n", driver.getSessionId());
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

        @Test
    public void firstTestTest() {
        // Verify Accessibility menu item is visible
       System.out.println("*************** firstTestTest ***************");
            System.out.printf("firstTestTest The driver Session Id %s%n", driver.getSessionId());
            Assert.assertTrue(true);
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
    @AfterMethod
    public void takeScreenOnFailor(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            // Take A Screen Shot for Failed Element
            supportClass.takeElementsScreenshot(driver, result.getName());
        }
    }

}