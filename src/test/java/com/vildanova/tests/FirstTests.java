package com.vildanova.tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static com.vildanova.constant.Constant.url.FIRST_HOME_PAGE;

public class FirstTests extends TestBase {

    @Test
    @Feature("Main page")
    @Story("Test number one")
    @Owner("Vildanova Kamilya")
    @Severity(SeverityLevel.NORMAL)
    @Link(name = "www.litres.ru", url = "https://www.litres.ru")
    @Description("Здесь находится некий текст-описание для теста")
    public void firstTest() {
        // Open site litres.ru
        basePage.openSite(FIRST_HOME_PAGE);

        // Basic steps
        mainPage.chooseBook();
        pdpPage.goToReviews();

        // Check the result
        assertPage.checkResult();
    }
}
