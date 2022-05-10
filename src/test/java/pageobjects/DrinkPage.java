package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrinkPage extends AbstractPage{

    private final String titleDrink = "Напитки";

    private WebDriver driver;
    @FindBy(xpath = "//div[@class='pageTitle']/h1")
    private WebElement labelHeaderDrink;
    @FindBy(xpath = "//button[@rel='2630']/span/span")
    private WebElement buttonAddDrink;

    public DrinkPage openDrinkPage() {
        driver.get(MENU_DRINK_PAGE);
        return this;
    }

    public DrinkPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MenuOrder clickOrderDrink() {
        buttonAddDrink.click();
        return new MenuOrder(driver);
    }

    public String getTitleDrink(){
        return labelHeaderDrink.getText();
    }
}
