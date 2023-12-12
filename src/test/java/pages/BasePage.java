package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * BasePage class represents the base page for all page objects.
 * It provides common functionality and initialization for page objects.
 */
public abstract class BasePage {
    /**
     * Constructor for BasePage class.
     *
     * @param driver The WebDriver instance to use for interactions.
     */
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}