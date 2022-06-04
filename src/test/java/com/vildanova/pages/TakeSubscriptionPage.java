package com.vildanova.pages;

import com.vildanova.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeSubscriptionPage extends BasePage {

    public TakeSubscriptionPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='get_book_by_subscr']")
    private WebElement takeSubscription;

    @FindBy(xpath = "//*[contains(@class,'btn_green')]")
    private WebElement buyBook;

    @FindBy(xpath = "//iframe[@id='payment-iframe']")
    private WebElement selectFrame;

    public void takeSubscription() {
        takeSubscription.click();
    }

    public void buyBook() {
        buyBook.click();
    }

    public void switchTo() {
        driver.switchTo().frame(selectFrame);
    }

}
