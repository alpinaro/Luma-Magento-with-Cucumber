package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ProductPage;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class ProductSteps {

    ProductPage product = new ProductPage();

    @When("choose size M")
    public void chooseSizeM() {

        product.productSizeM.click();
    }

    @And("choose color Blue")
    public void chooseColorBlue() {

        product.productColorBlue.click();
    }


    @And("add product to cart")
    public void addProductToCart() {

        product.productAddToCart.click();
    }
}
