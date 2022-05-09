import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.PizzaPage;

import static org.testng.Assert.assertEquals;

public class PizzaPageTest extends AbstractTest {

    @Test
    public void testPizzaPageCreateOrder() {
        PizzaPage pizzaPage = new HomePage(driver)
                .openPage()
                .clickButtonPizza();

        assertEquals(pizzaPage.getTitleHeaderPizza(), PizzaPage.titleHeaderPizzaPage);
        assertEquals(pizzaPage.getTitlePizzaMargherita(), PizzaPage.titlePizzaMargheritaName);
    }
}
