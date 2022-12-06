package ru.yandex.samokatpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentPage {
    private WebDriver driver;

    private By dateLocator = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By dateCalendar = By.xpath(".//div[@class='react-datepicker__week']/div[@aria-label='Choose суббота, 1-е октября 2022 г.']");
    private By dateCalendarClos= By.xpath(".//div[@class='react-datepicker__week']/div[@aria-label='Choose воскресенье, 2-е октября 2022 г.']");
    private By timeLocator = By.className("Dropdown-control");
    private By timeOpen = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    private By timeClose = By.xpath(".//div[@class='Dropdown-menu']/div[5]");
    private By colourBlack = By.id("black");
    private By colourGrey = By.id("grey");
    private By comment = By.cssSelector(".Input_InputContainer__3NykH .Input_Responsible__1jDKN");
    private By rent = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[2]");
    private By approve = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]");
    private By successfully = By.className("Order_ModalHeader__3FDaJ");

    public RentPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void sendFirstInfoForRentScooter() {
        driver.findElement(dateLocator).click();
        driver.findElement(dateCalendar).click();
        driver.findElement(timeLocator).click();
        driver.findElement(timeOpen).click();
        driver.findElement(colourBlack).click();
        driver.findElement(comment).sendKeys("позязя");
        driver.findElement(rent).click();
    }

    public void sendSecondInfoForRentScooter() {
        driver.findElement(dateLocator).click();
        driver.findElement(dateCalendar).click();
        driver.findElement(timeLocator).click();
        driver.findElement(timeClose).click();
        driver.findElement(colourGrey).click();
        driver.findElement(comment).sendKeys("");
        driver.findElement(rent).click();
    }

    public void sendApproveForRentScooter() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(driver -> driver.findElement(approve)).click();
    }

    public String sendTextSuccessfullyForRentScooter() {
        return driver.findElement(successfully).getText();
    }

}
