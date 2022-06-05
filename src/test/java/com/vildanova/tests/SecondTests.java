package com.vildanova.tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.vildanova.constant.Constant.url.SECOND_HOME_PAGE;

public class SecondTests extends TestBase {

    @Test
    @Feature("Pdp")
    @Story("Test number two")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "www.litres.ru", url = "https://www.litres.ru")
    @Description("Комментарий ко 2 тесту")
    public void secondTest() {

        basePage.openSite(SECOND_HOME_PAGE);

        mainPage.selectMenu();
        menuPage.selectSubTopic();
        anotherThemePage
                .selectButton()
                .selectThemeOfMenu()
                .selectBook();
        takeSubscriptionPage
                .takeSubscription()
                .buyBook()
                .switchTo();

        assertPage
                .checkNameOfButton()
                .checkTitle();
    }
}
