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

    public void sendLoginFirstVersion() {
        driver.findElement(name).sendKeys("Клоун");
        driver.findElement(surname).sendKeys("Клоунов");
        driver.findElement(address).sendKeys("Клоуна 12");
        driver.findElement(metrostation).click();
        driver.findElement(metrostation1).click();
        driver.findElement(telephone).sendKeys("+79998343290");
        driver.findElement(next).click();
    }

    public void sendLoginSecondVersion() {
        driver.findElement(name).sendKeys("Кирилл");
        driver.findElement(surname).sendKeys("Щекилов");
        driver.findElement(address).sendKeys("Василина 19");
        driver.findElement(metrostation).click();
        driver.findElement(metrostation1).click();
        driver.findElement(telephone).sendKeys("+79993332210");
        driver.findElement(next).click();
    }
}
}