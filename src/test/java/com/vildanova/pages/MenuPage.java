package com.vildanova.pages;

import com.vildanova.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/znaniya-navyki/']/../ul/li/a[text()='Саморазвитие / личностный рост']")
    private WebElement selectSection;

    public void selectSelection(){
        selectSection.click();
    }
}
