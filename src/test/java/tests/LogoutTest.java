package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


/**
 * LogoutTest class contains test scenarios related to user logout functionality.
 */
public class LogoutTest extends BaseTest {
    @BeforeMethod
    public void precondition() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    /**
     * Test to verify the user can successfully log out and is redirected to the login page.
     */
    @Test
    public void logoutTest() {
        // Logout in Product Page
        ProductPage productPage = new ProductPage(driver);
        productPage.openMenu();
        productPage.logout();

        // Verify we are in the Login Page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.isLoginPage();
    }
}