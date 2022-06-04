package com.vildanova.tests;

import org.testng.annotations.Test;

import static com.vildanova.constant.Constant.url.FIRST_HOME_PAGE;

public class FirstTests extends TestBase {

    @Test
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
