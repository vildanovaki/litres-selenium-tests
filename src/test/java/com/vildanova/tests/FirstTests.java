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
    @Description("1) Зайти на сайт (https://www.litres.ru/)\n" +
            "2) Пролистать страницу вниз до середины\n" +
            "3) Выбрать любую книгу (нажать на ее обложку чтобы перейти на страницу PDP\n" +
            "с подробной информацией о товаре), \n" +
            "4) После открытия подробной информации о книге пролистать чуть ниже до блока меню " +
            "(О книге, Цитаты, Отзывы, Читать онлайн)\n" +
            "5) Нажать на кнопку \"Отзывы\" \n" +
            "6) Сделать проверку что на странице появилась такая кнопка \"Оставить отзыв\".")
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
