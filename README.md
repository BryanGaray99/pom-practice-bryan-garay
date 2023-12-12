# Selenium - Java - TestNG Project
This project automates test scenarios for the web application https://www.saucedemo.com/.
## Project Structure
The project is organized with the following structure:
- src/test/java/pages
- src/test/java/tests
- src/test/java/utils
- pom.xml
- suite.xml

## Page Objects
- *BasePage*: Represents the base page for all page objects, providing common functionality and initialization.
- *LoginPage*: Represents the login page with methods for login and checking if the current page is the login page.
- *ProductPage*: Represents the product page with methods for adding products to the cart, navigating to the cart, and logging out.
- *CartPage*: Represents the shopping cart page with methods for proceeding to checkout, removing items, and checking if the cart is empty.
- *PersonalDataPage*: Represents the personal data entry page with methods for entering personal data during checkout.
- *OverviewPage*: Represents the order overview page with a method for completing the checkout process.
- *CompleteCheckoutPage*: Represents the page confirming a completed order with methods for checking completion and navigating back home.

## Test Classes
- *PurchaseTest*: Contains a test scenario to verify the complete buyflow, from selecting a product to reaching the thank you page.
- *RemoveFromCartTest*: Contains a test scenario to verify removing three different elements from the shopping cart and checking it's empty.
- *LogoutTest*: Contains a test scenario to verify the user can successfully log out and is redirected to the login page.

## How to Run the Tests
1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Configure the Selenium WebDriver and TestNG dependencies.
4. Run the test classes individually or create a TestNG suite for organized execution.

## Dependencies
- Selenium WebDriver
- TestNG