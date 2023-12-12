package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * PersonalDataPage class represents the personal data entry page.
 * It provides methods to enter personal data during the checkout process.
 */
public class PersonalDataPage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstNameInput;
    @FindBy(id = "last-name")
    private WebElement lastNameInput;
    @FindBy(id = "postal-code")
    private WebElement zipCodeInput;
    @FindBy(id = "continue")
    private WebElement continueButton;

    public PersonalDataPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Enters personal data during the checkout process.
     *
     * @param firstName The first name to enter.
     * @param lastName  The last name to enter.
     * @param zipCode   The ZIP code to enter.
     */
    public void enterPersonalData(String firstName, String lastName, String zipCode) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        zipCodeInput.sendKeys(zipCode);
        continueButton.click();
    }
}