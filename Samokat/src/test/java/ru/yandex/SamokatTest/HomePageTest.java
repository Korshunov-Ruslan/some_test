package ru.yandex.SamokatTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class HomePageTest {
    WebDriver driver = new FirefoxDriver();
    HomePageScooter objHomePageScooter = new HomePageScooter(driver);

    @Before
    public void startUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objHomePageScooter.clickCookie();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void shouldEqualTextAccordionHeadin_0() {
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = objHomePageScooter.getTextAccordionHeadin0();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin_1() {
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = objHomePageScooter.getTextAccordionHeadin1();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin2() {
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = objHomePageScooter.getTextAccordionHeadin2();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin3() {
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = objHomePageScooter.getTextAccordionHeadin3();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin4() {
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = objHomePageScooter.getTextAccordionHeadin4();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin5() {
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = objHomePageScooter.getTextAccordionHeadin5();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin6() {
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = objHomePageScooter.getTextAccordionHeadin6();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEqualTextAccordionHeadin7() {
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = objHomePageScooter.getTextAccordionHeadin7();
        assertEquals(expected, actual);
    }
}
}
