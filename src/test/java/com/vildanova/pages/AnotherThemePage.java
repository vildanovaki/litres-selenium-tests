package com.vildanova.pages;

import com.vildanova.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static io.qameta.allure.Allure.step;

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

    @Step("Нажать на кнопку")
    public AnotherThemePage selectButton(){
        step("Дополнительное действие", ()->{
            selectButton.click();
        });
        return this;
    }

    @Step("Выбрать тему из меню")
    public AnotherThemePage selectThemeOfMenu(){
        selectThemeOfMenu.click();
        return this;
    }

    @Step("Выбрать книгу")
    public void selectBook(){
        selectBook.click();
    }
}
