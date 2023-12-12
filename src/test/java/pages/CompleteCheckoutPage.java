package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * CompleteCheckoutPage class represents the page confirming a completed order.
 * It provides methods to check the completion status and navigate back home.
 */
public class CompleteCheckoutPage extends BasePage {
    @FindBy(className = "complete-header")
    private WebElement completeHeader;
    @FindBy(id = "back-to-products")
    private WebElement backHomeButton;
    public CompleteCheckoutPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Checks if the purchase has been completed successfully.
     * Verifies the presence of the completion header text or the correct URL.
     */
    public void checkCompletedPurchase() {
        if (completeHeader.isDisplayed() && completeHeader.getText().contains("Thank you for your order!")) {
            return;
        }
        String expectedUrl = "https://saucedemo.com/checkout-complete.html";
        if (driver.getCurrentUrl().equals(expectedUrl)) {
            return;
        }
        Assert.fail("Page verification failed. The expected text or URL is not present.");
    }
    public void goBackHome() {
        backHomeButton.click();
    }
}