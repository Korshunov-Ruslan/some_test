package ru.yandex.SamokatPOM;

public class OrderPage {
    private WebDriver driver;

    private By buttonUp = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    private By buttonDown = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");

    private By name = By.xpath(".//input[@placeholder='* Имя']");
    private By surname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By address = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metrostation = By.cssSelector(".select-search__value .select-search__input");
    private By metrostation1 = By.xpath(".//input[@placeholder='* Станция метро']");
    private By telephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By next = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    public OrderPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonUp() {
        driver.findElement(buttonUp).click();
    }

    public void clickButtonDown() {
        driver.findElement(buttonDown).click();
    }
}
}
