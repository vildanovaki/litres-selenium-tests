package com.vildanova.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSite(String url) {
        driver.get(url);
    }
}
