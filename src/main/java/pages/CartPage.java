package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(className = "inventory_item_name")
    private WebElement productName;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return productName.getText();
    }
}
