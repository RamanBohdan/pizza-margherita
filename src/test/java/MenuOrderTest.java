import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.MenuOrder;

public class MenuOrderTest extends AbstractTest {

    @Test
    public void testMenuOrderAvailabilityOrder() {
        MenuOrder menuOrder = new HomePage(driver)
                .openPage()
                .clickButtonPizza()
                .addOrderPizzaInBasket();

        Assert.assertEquals(menuOrder.getTitleCheckout(), MenuOrder.titleMenuOrder);
    }
}
