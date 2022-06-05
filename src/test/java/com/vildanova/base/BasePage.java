package com.vildanova.base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыть главную страницу")
    public void openSite(String url) {
        driver.get(url);
    }
}
