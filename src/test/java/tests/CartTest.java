package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;

public class CartTest extends BaseTest {

    @Test
    public void testAddToCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCart();
        productsPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getProductName(), "Sauce Labs Backpack");
    }
}
