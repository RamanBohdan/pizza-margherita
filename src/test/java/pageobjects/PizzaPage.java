package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PizzaPage extends AbstractPage {

    public final static String titleHeaderPizzaPage = "Пицца";
    public final static String titlePizzaMargheritaName = "Пицца \"Маргарита\"";

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='pageTitle']/h1")
    private WebElement labelHeaderPizza;
    @FindBy(xpath = "//div[@id='1']/h3/span")
    private WebElement labelPizzaMargherita;
    @FindBy(xpath = "//*[@id='1']//button/span/span")
    private WebElement buttonOrderPizzaMargherita;
    @FindBy(xpath = "//div[@id='order_pizza_popup']//button")
    private WebElement buttonOrderPizzaMargheritaInBasket;

    public PizzaPage openPagePizza() {
        driver.get(PIZZA_PAGE_URL);
        return this;
    }

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MenuOrder clickOrderPizza() {
        buttonOrderPizzaMargherita.click();
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .visibilityOf(buttonOrderPizzaMargherita));
        buttonOrderPizzaMargheritaInBasket.click();
        return new MenuOrder(driver);
    }

    public boolean isPizzaInBasket(String pizzaName) {
        return labelPizzaMargherita.getText().contains(pizzaName);
    }

    public String getTitleHeaderPizza() {
        return labelHeaderPizza.getText();
    }

    public String getTitlePizzaMargherita() {
        return labelPizzaMargherita.getText();
    }
}