package com.vildanova.pages;

import com.vildanova.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class ChecksPage extends BasePage {

    public ChecksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Оставить отзыв']")
    private WebElement checkButtonReviews;

    @FindBy(xpath = "//form[@id='asking-email_qiwi_pay']/button")
    private WebElement checkNameOfButton;

    @FindBy(xpath = "//*[text() = 'Оплата банковской картой']")
    private WebElement checkTitle;

    public void checkResult() {
        assertEquals(checkButtonReviews.getText(), "+ Оставить отзыв");
    }

    public void checkNameOfButton() {
        assertEquals(checkNameOfButton.getText(), "ПЕРЕЙТИ К ОПЛАТЕ");
    }

    public void checkTitle() {
        assertEquals(checkTitle.getText(), "Оплата банковской картой");
    }
}