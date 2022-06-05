package com.vildanova.pages;

import com.vildanova.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-page='2']/ul/li[3]/div[2]")
    private WebElement selectBook;

    @FindBy(xpath = "//div[@class='LowerMenu-module__wrapper']//a[@href='/pages/new_genres/'][1]")
    private WebElement selectMenu;

    @Step("Выбрать книгу")
    public void chooseBook() {
        selectBook.click();
    }

    @Step("Открыть меню")
    public void selectMenu(){
        selectMenu.click();
    }
}
