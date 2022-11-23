package ru.yandex.SamokatTest;

import static org.hamcrest.CoreMatchers.containsString;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RentPageTest {
    WebDriver driver = new FirefoxDriver();
    HomePageScooter objHomePageScooter = new HomePageScooter(driver);
    OrderPageScooter objOrderPageScooter = new OrderPageScooter(driver);
    RentPageScooter objRentPageScooter = new RentPageScooter(driver);

    @Before
    public void startUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objHomePageScooter.clickCookie();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void shouldOrderScooterForSendLoginFirstVersionToClickButtonUp() {
        objOrderPageScooter.clickButtonUp();
        objOrderPageScooter.sendLoginFirstVersion();
        objRentPageScooter.sendFirstInfoForRentScooter();
        objRentPageScooter.sendApproveForRentScooter();
        String expected = "Заказ оформлен";
        String actual = objRentPageScooter.sendTextSuccessfullyForRentScooter();
        MatcherAssert.assertThat(actual, containsString(expected));
    }

    @Test
    public void shouldOrderScooterForSendLoginSecondVersionToClickButtonDown() {
        objOrderPageScooter.clickButtonDown();
        objOrderPageScooter.sendLoginSecondVersion();
        objRentPageScooter.sendSecondInfoForRentScooter();
        objRentPageScooter.sendApproveForRentScooter();
        String expected = "Заказ оформлен";
        String actual = objRentPageScooter.sendTextSuccessfullyForRentScooter();
        MatcherAssert.assertThat(actual, containsString(expected));
    }
}
}
