package org.example;

import io.appium.java_client.*;
import org.openqa.selenium.*;

import java.util.*;

public class UpdateProfile extends LandingPageTest{
public  WebElement getElementBy(FindBy BY,String str) {
    WebElement element = null;
    if (Objects.requireNonNull(BY) == FindBy.ID) {
        element = driver.findElement(AppiumBy.id(str));
    } else if (Objects.requireNonNull(BY) == FindBy.XPATH) {
        element = driver.findElement(AppiumBy.xpath(str));
    } else if (Objects.requireNonNull(BY) == FindBy.CLASSNAME) {
        element = driver.findElement(AppiumBy.className(str));
    }
    return element;
}

    WebElement appBarTitle = getElementBy(FindBy.ID, "00000000-0000-006c-0000-001600000004");
    WebElement backBtn = getElementBy(FindBy.ID, "00000000-0000-006c-0000-001600000004");

    WebElement infoUpdateBTN = getElementBy(FindBy.XPATH, "(//android.widget.Button[@content-desc=\"✏\"])[1]");
    WebElement aboutUpdateBTN = getElementBy(FindBy.XPATH, "(//android.widget.Button[@content-desc=\"✏\"])[2]");
    WebElement eduUpdateBTN = getElementBy(FindBy.XPATH, "(//android.widget.Button[@content-desc=\"✏\"])[3]");
    WebElement exUpdateBTN = getElementBy(FindBy.XPATH, "(//android.widget.Button[@content-desc=\"✏\"])[4]");
    WebElement contactUpdateBTN = getElementBy(FindBy.XPATH, "(//android.widget.Button[@content-desc=\"✏\"])[5]");
    WebElement profileIMG = getElementBy(FindBy.CLASSNAME, "android.widget.ImageView");

}

