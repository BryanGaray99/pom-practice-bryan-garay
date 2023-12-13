package tests;

import data.TestsDataProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

/**
 * PurchaseTest class contains test scenarios related to the purchase flow.
 */
public class PurchaseProductTest extends BaseTest {
    @BeforeMethod
    public void precondition() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    /**
     * Test to verify the complete buy flow, from selecting a product to reaching the thank you page.
     */
    @Test(dataProvider = "purchase data", dataProviderClass = TestsDataProvider.class)
    public void purchaseProductTest(String firstName, String lastName, String zipCode) {
        // Select the product
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart(1);
        productPage.goToShoppingCart();

        // Shopping Cart
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        // Enter personal data
        PersonalDataPage personalDataPage = new PersonalDataPage(driver);
        personalDataPage.enterPersonalData(firstName, lastName, zipCode);

        // Confirm to finish the order
        OverviewPage overviewPage = new OverviewPage(driver);
        overviewPage.completeCheckout();

        // Check we finished and go back
        CompleteCheckoutPage completeCheckoutPage = new CompleteCheckoutPage(driver);
        completeCheckoutPage.checkCompletedPurchase();
        completeCheckoutPage.goBackHome();
    }
}