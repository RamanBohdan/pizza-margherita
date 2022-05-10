package testpage;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.MenuOrder;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MenuOrderTest extends AbstractTest {

    private final String pizzaName = "Пицца \"Маргарита\"";
    private final String drinkName = "Душистый чай с ромашкой и бузиной";

    @Test
    public void testMenuOrderAvailabilityWithPizza() {
        MenuOrder menuOrder = new HomePage(driver)
                .openPage()
                .clickButtonPizza()
                .clickOrderPizza()
                .openPageMenuOrder();

        assertEquals(menuOrder.getTitleCheckout(), MenuOrder.titleMenuOrder);
        assertTrue(menuOrder.isPizzaInBasket(pizzaName));
    }

    @Test
    public void testMenuOrderAvailabilityWithDrink() {
        MenuOrder menuOrder = new HomePage(driver)
                .openPage()
                .clickButtonDrink()
                .clickOrderDrink()
                .openPageMenuOrder();

        assertTrue(menuOrder.isDrinkInBasket(drinkName));
    }
}
