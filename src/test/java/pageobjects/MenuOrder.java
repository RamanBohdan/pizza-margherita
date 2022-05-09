package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuOrder extends AbstractPage {

    public final static String titleMenuOrder ="Оформление заказа";

    @FindBy(xpath = "//div[@class='pageTitle']/h1")
    private WebElement labelCheckout;

    private WebDriver driver;

    public MenuOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MenuOrder openPageMenuOrder(){
        driver.get(MENU_ORDER_PAGE);
        return this;
    }

    public String getTitleCheckout(){
        return labelCheckout.getText();
    }
}
