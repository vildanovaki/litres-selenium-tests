package com.vildanova.pages;

import com.vildanova.base.BasePage;
import org.openqa.selenium.WebDriver;

public class SwitchToFramePage extends BasePage {

    public SwitchToFramePage(WebDriver driver) {
        super(driver);
    }

    public void switchTo(String name) {

        driver.switchTo().frame(name);
    }
}
