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
    @Description("1) Зайти на сайт (https://www.litres.ru/)\n" +
            "2) В верхнем меню нажать на кнопку \"Жанры\"\n" +
            "3) В разделе \"Знания и навыки\" нажать на подраздел \"Саморазвитие / личностный рост\"\n" +
            "4) Нажать на кнопку \"Электронные и аудиокниги\" \n" +
            "5) Выбрать в выпадающем списке \"Аудиокниги\"\n" +
            "6) На открывшейся странице выбрать любую книгу\n" +
            "7) Нажать на кнопку \"ВЗЯТЬ ПО АБОНЕМЕНТУ\"\n" +
            "8) Нажать на кнопку \"КУПИТЬ АБОНЕМЕНТ ЗА\"\n " +
            "9) Проверить, что на открывшейся странице есть кнопка \"ПЕРЕЙТИ К ОПЛАТЕ\"\n" +
            "10) Проверить, что на странице есть текст \"Оплата банковской картой\"")
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
