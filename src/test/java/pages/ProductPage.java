package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

/**
 * ProductPage class represents the product page of the web application.
 * It provides methods to interact with the product-related functionality.
 */
public class ProductPage extends BasePage {
    @FindBy(className = "btn_inventory")
    private List<WebElement> addToCartButtons;
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartButton;
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Adds products to the shopping cart.
     * @param quantity The quantity of products that needs to be added
     */
    public void addToCart(int quantity) {
        int availableProducts = addToCartButtons.size();
        if (quantity > 0 && quantity <= availableProducts) {
            for (int i = 0; i < quantity; i++) {
                addToCartButtons.get(i).click();
            }
        } else {
            throw new IllegalArgumentException("Invalid quantity of products to add to cart");
        }
    }
    public void goToShoppingCart() {
        shoppingCartButton.click();
    }
    public void openMenu() {
        menuButton.click();
    }
    public void logout() {
        logoutButton.click();
    }
}