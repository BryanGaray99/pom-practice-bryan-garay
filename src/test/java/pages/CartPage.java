package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

/**
 * CartPage class represents the shopping cart page.
 * It provides methods to interact with the shopping cart functionality.
 */
public class CartPage extends BasePage {
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(className = "cart_button")
    private List<WebElement> removeButtons;
    @FindBy(className = "shopping_cart_badge ")
    private WebElement shoppingCartBadge;
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }

    /**
     * Removes all items from the shopping cart.
     */
    public void removeItem() {
        for (WebElement removeButton : removeButtons) {
            removeButton.click();
        }
    }

    /**
     * Checks if the shopping cart is empty.
     *
     * @return true if the cart is empty, false otherwise.
     */
    public boolean isCartEmpty() {
        try {
            WebElement cartBadge = shoppingCartBadge.findElement(By.tagName("span"));
            int cartItemCount = Integer.parseInt(cartBadge.getText().trim());
            return cartItemCount == 0;
        } catch (org.openqa.selenium.NoSuchElementException | NumberFormatException e){
            return true;
        }
    }
}