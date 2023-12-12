package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * OverviewPage class represents the order overview page.
 * It provides methods to complete the checkout process.
 */
public class OverviewPage extends BasePage {
    @FindBy(id = "finish")
    private WebElement finishButton;
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    public void completeCheckout() {
        finishButton.click();
    }
}