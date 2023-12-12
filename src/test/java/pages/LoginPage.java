package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * LoginPage class represents the login page of the web application.
 * It provides methods to interact with the login functionality.
 */
public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Performs login with the given username and password.
     *
     * @param username The username to use for login.
     * @param password The password to use for login.
     */
    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    /**
     * Checks if the current page is the login page.
     *
     * @return true if on the login page, false otherwise.
     */
    public boolean isLoginPage() {
        return driver.getCurrentUrl().contains("https://www.saucedemo.com/");
    }
}