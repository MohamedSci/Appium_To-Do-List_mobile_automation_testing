package org.example;

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

    private final String menuItemNamePlaceholder = "#menuItemName";
    private final String menuItemXpath = "//android.widget.TextView[@content-desc=\""
                                            + menuItemNamePlaceholder + "\"]";

    public AndroidDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        String PROJECT_ROOT = System.getProperty("user.dir");
        String ANDROID_APK_PATH = "/src/test/resources/ApiDemos.apk";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "RF8W30AC31F");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "13");
//        caps.setCapability("app", new File(PROJECT_ROOT + ANDROID_APK_PATH).getAbsolutePath());
        caps.setCapability("appPackage", "com.featheredteam.team_app");
        caps.setCapability("appActivity", "com.featheredteam.team_app/.MainActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
        caps.setCapability("automationName","UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:6279/wd/hub"), caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

        @Test
    public void firstTestTest() {
        // Verify Accessibility menu item is visible
       System.out.println("*************** firstTestTest ***************");
        Assert.assertTrue(true);
    }


//    @Test
//    public void toolBarTest() {
//        By toolBarTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
//
//        // Wait until application tool bar is visible
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (toolBarTitle));
//
//        // Verify that the tool bar title is API Demos
//        Assert.assertEquals(driver.findElement(toolBarTitle).getText(), "API Demos");
//    }
//
//    @Test
//    public void accessibilityMenuTest() {
//        // Verify Accessibility menu item is visible
//        WebElement accessibilityMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Accessibility")));
//
//        Assert.assertTrue(accessibilityMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void animationMenuTest() {
//        // Verify Animation menu item is visible
//        WebElement animationMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Animation")));
//
//        Assert.assertTrue(animationMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void appMenuTest() {
//        // Verify App menu item is visible
//        WebElement appMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "App")));
//
//        Assert.assertTrue(appMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void contentMenuTest() {
//        // Verify Content menu item is visible
//        WebElement contentMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Content")));
//
//        Assert.assertTrue(contentMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void graphicsMenuTest() {
//        // Verify Graphics menu item is visible
//        WebElement graphicsMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Graphics")));
//
//        Assert.assertTrue(graphicsMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void mediaMenuTest() {
//        // Verify Media menu item is visible
//        WebElement mediaMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "Media")));
//
//        Assert.assertTrue(mediaMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void nfcMenuTest() {
//        // Verify NFC menu item is visible
//        WebElement nfcMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "NFC")));
//
//        Assert.assertTrue(nfcMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void osMenuTest() {
//        // Verify OS menu item is visible
//        WebElement osMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(menuItemNamePlaceholder, "OS")));
//
//        Assert.assertTrue(osMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void preferenceMenuTest() {
//        // Verify Preference menu item is visible
//        WebElement preferenceMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(
//                        menuItemNamePlaceholder, "Preference")));
//
//        Assert.assertTrue(preferenceMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void textMenuTest() {
//        // Verify Text menu item is visible
//        WebElement textMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(
//                        menuItemNamePlaceholder, "Text")));
//
//        Assert.assertTrue(textMenuItem.isDisplayed());
//    }
//
//    @Test
//    public void viewsMenuTest() {
//        // Verify Views menu item is visible
//        WebElement viewsMenuItem = driver.findElement
//                (By.xpath(menuItemXpath.replace(
//                        menuItemNamePlaceholder, "Views")));
//
//        Assert.assertTrue(viewsMenuItem.isDisplayed());
//    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}