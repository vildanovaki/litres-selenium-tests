package com.vildanova.tests;

import com.vildanova.base.BasePage;
import com.vildanova.config.DriverActions;
import com.vildanova.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import static com.vildanova.config.BrowserSettings.CLEAR_COOKIES_AND_STORAGE;
import static com.vildanova.config.BrowserSettings.HOLD_BROWSER_OPEN;

public class TestBase {

    WebDriver driver = DriverActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected MenuPage menuPage = new MenuPage(driver);
    protected AnotherThemePage anotherThemePage = new AnotherThemePage(driver);
    protected TakeSubscriptionPage takeSubscriptionPage = new TakeSubscriptionPage(driver);
    protected ProductDetailPage pdpPage = new ProductDetailPage(driver);
    protected ChecksPage assertPage = new ChecksPage(driver);

    @AfterTest
    public  void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if(HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }
}
