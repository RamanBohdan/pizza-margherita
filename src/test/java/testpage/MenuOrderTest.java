package testpage;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.MenuOrder;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MenuOrderTest extends AbstractTest {

    private final String pizzaName = "Пицца \"Маргарита\"";
    @Test
    public void testMenuOrderAvailabilityOrder() {
        MenuOrder menuOrder = new HomePage(driver)
                .openPage()
                .clickButtonPizza()
                .clickOrderPizza()
                .openPageMenuOrder();

        assertEquals(menuOrder.getTitleCheckout(), MenuOrder.titleMenuOrder);
        assertTrue(menuOrder.isPizzaInBasket(pizzaName));
    }
}
