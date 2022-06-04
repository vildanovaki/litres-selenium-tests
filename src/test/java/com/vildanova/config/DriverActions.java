package com.vildanova.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

import static com.vildanova.config.BrowserSettings.BROWSER;
import static com.vildanova.config.BrowserSettings.BROWSER_SIZE_MAX;
import static com.vildanova.constant.Constant.timeoutVariables.IMPLICIT_WAIT;

public class DriverActions {

    public static WebDriver createDriver() {

        WebDriver driver = null;

        switch (BROWSER) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name: " + BROWSER);
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        if (BROWSER_SIZE_MAX) {
            driver.manage().window().maximize();
        } else {
            driver.manage().window().setSize(BrowserSettings.BROWSER_SIZE);
        }

        return driver;
    }
}
