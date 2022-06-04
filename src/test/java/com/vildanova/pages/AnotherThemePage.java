package com.vildanova.pages;

import com.vildanova.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnotherThemePage extends BasePage {
    public AnotherThemePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Электронные и аудиокниги ']")
    private WebElement selectButton;

    @FindBy(xpath = "//*[contains(@class,'sorting-block__list')]//span[text()='Аудиокниги']")
    private WebElement selectThemeOfMenu;

    @FindBy(xpath = "//div[@class='line line-2']/div[2]/div")
    private WebElement selectBook;

    public void selectButton(){
        selectButton.click();
    }

    public void selectThemeOfMenu(){
        selectThemeOfMenu.click();
    }

    public void selectBook(){
        selectBook.click();
    }
}
