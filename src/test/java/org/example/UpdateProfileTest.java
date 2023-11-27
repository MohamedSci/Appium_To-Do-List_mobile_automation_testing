package org.example;

import io.appium.java_client.*;
import org.openqa.selenium.*;
import org.testng.annotations.*;

public class UpdateProfileTest extends LandingPageTest{

    @Test
    public void updateProfileTest(){

        WebElement el21 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]"));
        el21.click();
        WebElement el22 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"تم تسجيل الدخول\nmohamed \nmuhammedsaidsyed215@gmail.com\"]/android.view.View"));
        el22.click();
        WebElement el23 = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Mohamed \"])[1]"));
        el23.click();
        WebElement el24 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"✏\"])[1]"));
        el24.click();
        WebElement el25 = driver.findElement(AppiumBy.accessibilityId("المعلومات الاساسية"));
        el25.click();
        WebElement el26 = driver.findElement(AppiumBy.accessibilityId("الاسم\nالوظيفة"));
        el26.click();
        WebElement el27 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"mohamed \"]"));
        el27.click();
        el27.sendKeys("Mohamed");
        WebElement el28 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"chemist \"]"));
        el28.click();
        el28.sendKeys("Chemist");
        el28.clear();
        el28.sendKeys("Chemist");
        WebElement el29 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"mohamed Mohamed\"]"));
        el29.clear();
        WebElement el30 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"الاسم\nالوظيفة\"]/android.widget.EditText[1]"));
        el30.click();
        el30.clear();
        el30.sendKeys("Mohamed Said");
        WebElement el31 = driver.findElement(AppiumBy.className("android.widget.Button"));
        el31.click();
        WebElement el32 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"✏\"])[2]"));
        el32.click();
        WebElement el33 = driver.findElement(AppiumBy.accessibilityId("اكتب نبذة عن نفسك"));
        el33.click();
        WebElement el34 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        el34.click();
        el34.clear();
        el34.sendKeys("aaaaaaaaa aaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        WebElement el35 = driver.findElement(AppiumBy.className("android.widget.Button"));
        el35.click();
        WebElement el36 = driver.findElement(AppiumBy.accessibilityId("التعليم"));
        el36.click();
        WebElement el37 = driver.findElement(AppiumBy.accessibilityId("Bachelor of science "));
        el37.click();
        WebElement el38 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"✏\"])[3]"));
        el38.click();
        WebElement el39 = driver.findElement(AppiumBy.accessibilityId("التعليم"));
        el39.click();
        WebElement el40 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        el40.click();
        el40.clear();
        el40.sendKeys("eeeeeeeeeeeeeeeee eeeeeeeeeeeeeeeeeeeeeeeeeeeeee eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        WebElement el41 = driver.findElement(AppiumBy.className("android.widget.Button"));
        el41.click();
        WebElement el42 = driver.findElement(AppiumBy.accessibilityId("الخبرة"));
        el42.click();
        WebElement el43 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"✏\"])[4]"));
        el43.click();
        WebElement el44 = driver.findElement(AppiumBy.accessibilityId("اذكر خبراتك"));
        el44.click();
        WebElement el45 = driver.findElement(AppiumBy.className("android.widget.EditText"));
        el45.click();
        el45.clear();
        el45.sendKeys("xxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        WebElement el46 = driver.findElement(AppiumBy.className("android.widget.Button"));
        el46.click();
        WebElement el47 = driver.findElement(AppiumBy.accessibilityId("الواتس اب"));
        el47.click();
        WebElement el48 = driver.findElement(AppiumBy.accessibilityId("الفيس بوك"));
        el48.click();
        WebElement el49 = driver.findElement(AppiumBy.accessibilityId("لينكدان"));
        el49.click();
        WebElement el50 = driver.findElement(AppiumBy.accessibilityId("يوتيوب"));
        el50.click();
        WebElement el51 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"✏\"])[4]"));
        el51.click();
        WebElement el52 = driver.findElement(AppiumBy.accessibilityId("التواصل"));
        el52.click();
        WebElement el53 = driver.findElement(AppiumBy.accessibilityId("الواتس اب\nالفيس بوك\nلينكدان\nتويتر\nيوتيوب"));
        el53.click();
        WebElement el54 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"01155265518\"]"));
        el54.clear();
        el54.sendKeys("+2001155265518");
        WebElement el55 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"الواتس اب\nالفيس بوك\nلينكدان\nتويتر\nيوتيوب\"]/android.widget.EditText[2]"));
        el55.clear();
        el55.sendKeys("www.facebook.com");
        WebElement el56 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"الواتس اب\nالفيس بوك\nلينكدان\nتويتر\nيوتيوب\"]/android.widget.EditText[3]"));
        el56.clear();
        WebElement el57 = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"www.facebook.com\"]"));
        el57.click();
        el57.clear();
        el57.sendKeys("www.facebook.com");
        WebElement el58 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"الواتس اب\nالفيس بوك\nلينكدان\nتويتر\nيوتيوب\"]/android.widget.EditText[3]"));
        el58.click();
        el58.clear();
        el58.sendKeys("www.Linkedin.com");
        WebElement el59 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"الواتس اب\nالفيس بوك\nلينكدان\nتويتر\nيوتيوب\"]/android.widget.EditText[4]"));
        el59.click();
        el59.clear();
        el59.sendKeys("www.youtube.com");
        el59.clear();
        el59.sendKeys("www.twitter.com");
        WebElement el60 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"الواتس اب\nالفيس بوك\nلينكدان\nتويتر\nيوتيوب\"]/android.widget.EditText[5]"));
        el60.click();
        el60.clear();
        el60.sendKeys("www.youtube.com");
        WebElement el61 = driver.findElement(AppiumBy.className("android.widget.Button"));
        el61.click();
        WebElement el62 = driver.findElement(AppiumBy.accessibilityId("الواتس اب"));
        el62.click();
        WebElement el63 = driver.findElement(AppiumBy.accessibilityId("01155265518"));
        el63.click();
        WebElement el64 = driver.findElement(AppiumBy.accessibilityId("الفيس بوك"));
        el64.click();
        WebElement el65 = driver.findElement(AppiumBy.accessibilityId("www.facebook.com"));
        el65.click();
        WebElement el66 = driver.findElement(AppiumBy.accessibilityId("لينكدان"));
        el66.click();
        WebElement el67 = driver.findElement(AppiumBy.accessibilityId("www.Linkedin.com"));
        el67.click();
        WebElement el68 = driver.findElement(AppiumBy.accessibilityId("تويتر"));
        el68.click();
        WebElement el69 = driver.findElement(AppiumBy.accessibilityId("www.twitter.com"));
        el69.click();
        WebElement el70 = driver.findElement(AppiumBy.accessibilityId("يوتيوب"));
        el70.click();
        WebElement el71 = driver.findElement(AppiumBy.accessibilityId("www.youtube.com"));
        el71.click();
        driver.terminateApp("com.featheredteam.team_app");
        driver.activateApp("com.featheredteam.team_app");
        WebElement el72 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]"));
        el72.click();
        WebElement el73 = driver.findElement(AppiumBy.accessibilityId("تم تسجيل الدخول\nmohamed said\nmuhammedsaidsyed215@gmail.com"));
        el73.click();
        WebElement el74 = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"تم تسجيل الدخول\nmohamed said\nmuhammedsaidsyed215@gmail.com\"]/android.view.View"));
        el74.click();



    }

}