package com.vildanova.tests;

import org.testng.annotations.Test;

import static com.vildanova.constant.Constant.url.SECOND_HOME_PAGE;

@Test
public class SecondTests extends TestBase{

        public void secondTest() {

            basePage.openSite(SECOND_HOME_PAGE);
            mainPage.selectMenu();
            menuPage.selectSelection();
            anotherThemePage.selectButton();
            anotherThemePage.selectThemeOfMenu();
            anotherThemePage.selectBook();
            takeSubscriptionPage.takeSubscription();
            takeSubscriptionPage.buyBook();
            takeSubscriptionPage.switchTo();
            assertPage.checkNameOfButton();
            assertPage.checkTitle();
    }
}
