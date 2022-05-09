package testpage;

import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.MenuOrder;

import static org.testng.AssertJUnit.assertEquals;

public class MenuOrderTest extends AbstractTest {

    @Test
    public void testMenuOrderAvailabilityOrder() {
        MenuOrder menuOrder = new HomePage(driver)
                .openPage()
                .clickButtonPizza()
                .clickOrderPizza()
                .openPageMenuOrder();

        assertEquals(menuOrder.getTitleCheckout(), MenuOrder.titleMenuOrder);
    }
}
