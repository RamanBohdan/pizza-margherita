package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    public static final String titleShortNumberPhone = "7773";
    public static final String titleBasketPizza = "Ваша корзина пуста";
    public static final String titlePizzaLogo = "ПИЦЦА";
    public static final String titlePizzaSale = "АКЦИИ";
    public static final String titlePizzaBurger = "БУРГЕРЫ, ЗАКУСКИ, ФРИ";
    public static final String titlePizzaSalad = "САЛАТЫ, СУПЫ, ХЛЕБ";
    public static final String titlePizzaHot = "ГОРЯЧИЕ БЛЮДА";
    public static final String titlePizzaWater = "НАПИТКИ";
    public static final String titlePizzaDesert = "ДЕСЕРТЫ";
    public static final String titlePizzaChild = "ДЕТСКОЕ МЕНЮ";
    public static final String titlePizzaOtherGoods = "ДРУГИЕ ТОВАРЫ";

    private WebDriver driver;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[1]")
    private WebElement buttonPizza;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[2]")
    private WebElement buttonSale;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[3]")
    private WebElement buttonBurger;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[4]")
    private WebElement buttonSalad;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[5]")
    private WebElement buttonGoryachee;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[6]")
    private WebElement buttonNapitki;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[7]")
    private WebElement buttonDessert;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[8]")
    private WebElement buttonDeti;
    @FindBy(xpath = "//div[@class='mainmenu']/ul/li[9]")
    private WebElement buttonTovari;
    @FindBy(xpath = "//div[@class='header']//span[@class='number short_number']")
    private WebElement labelShortNumber;
    @FindBy(xpath = "//div[@class='basket']//span")
    private WebElement labelBasket;
    @FindBy(xpath = "//li[1][@class='other']//span")
    private WebElement labelPizzaLogoHome;
    @FindBy(xpath = "//li[2][@class='other']//span")
    private WebElement labelPizzaSaleHome;
    @FindBy(xpath = "//li[3][@class='other']//span")
    private WebElement labelPizzaBurgerHome;
    @FindBy(xpath = "//li[4][@class='other']//span")
    private WebElement labelPizzaSaladHome;
    @FindBy(xpath = "//li[5][@class='other']//span")
    private WebElement labelPizzaHotHome;
    @FindBy(xpath = "//li[6][@class='other']//span")
    private WebElement labelPizzaWaterHome;
    @FindBy(xpath = "//li[8][@class='other']//span")
    private WebElement labelPizzaDesertHome;
    @FindBy(xpath = "//li[9][@class='other']//span")
    private WebElement labelPizzaChildHome;
    @FindBy(xpath = "//li[11][@class='other']//span")
    private WebElement labelPizzaOtherGoodsHome;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public PizzaPage clickButtonPizza() {
        buttonPizza.click();
        return new PizzaPage(driver);
    }

    public String getTitleBasketPizza() {
        return labelBasket.getText();
    }

    public String getTitleShortNumber() {
        return labelShortNumber.getText();
    }

    public String getTitlePizzaLogoHome() {
        return labelPizzaLogoHome.getText();
    }

    public String getTitlePizzaSaleHome() {
        return labelPizzaSaleHome.getText();
    }

    public String getTitlePizzaBurgerHome() {
        return labelPizzaBurgerHome.getText();
    }

    public String getTitlePizzaSaladHome() {
        return labelPizzaSaladHome.getText();
    }

    public String getTitlePizzaHotHome() {
        return labelPizzaHotHome.getText();
    }

    public String getTitlePizzaWaterHome() {
        return labelPizzaWaterHome.getText();
    }

    public String getTitlePizzaDesertHome() {
        return labelPizzaDesertHome.getText();
    }

    public String getTitlePizzaChildHome() {
        return labelPizzaChildHome.getText();
    }

    public String getTitlePizzaOtherGoodsHome() {
        return labelPizzaOtherGoodsHome.getText();
    }
}
