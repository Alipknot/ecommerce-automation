package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(css = ".title")
    private WebElement title;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartLink;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void goToCart() {
        cartLink.click();
    }
}
