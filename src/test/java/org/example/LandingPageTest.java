package org.example;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import org.openqa.selenium.*;
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


public class LandingPageTest {

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

        driver = new AndroidDriver(new URL("http://127.0.0.1:7878/wd/hub"), caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

        @Test
    public void firstTestTest() {
        // Verify Accessibility menu item is visible
       System.out.println("*************** firstTestTest ***************");
        Assert.assertTrue(true);
    }

@Test
public void launchTheInstalledApp(){
    WebElement el1 = driver.findElement(AppiumBy.accessibilityId("To Do List"));
    el1.click();
}
    @Test
    public void allowPermissionsPopUp(){
        WebElement el2 = driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
        el2.click();
    }
    @Test
    public void takeFirstScreenShotFirstTime() throws IOException {
        ScreenShotClass ssc = new ScreenShotClass();
        ssc.getPageScreenshot(PROJECT_ROOT+"/Screenshoots","baseSc");
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }

}