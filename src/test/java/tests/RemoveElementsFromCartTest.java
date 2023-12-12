package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

/**
 * RemoveFromCartTest class contains test scenarios related to removing items from the shopping cart.
 */
public class RemoveElementsFromCartTest extends BaseTest {
    @BeforeMethod
    public void precondition() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    /**
     * Test to verify removing three different elements from the shopping cart and checking it's empty.
     */
    @Test
    public void removeElementsFromCartTest() {
        // Select the products
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart(3);
        productPage.goToShoppingCart();

        // Shopping Cart
        CartPage cartPage = new CartPage(driver);
        cartPage.removeItem();
        Assert.assertTrue(cartPage.isCartEmpty(), "Shopping cart is not empty");
    }
}