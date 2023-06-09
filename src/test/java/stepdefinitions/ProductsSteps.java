package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ProductsPage;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class ProductsSteps {

    ProductsPage products = new ProductsPage();

    @When("click Size option")
    public void clickSizeOption() {

        products.optionSize.click();
    }

    @And("select size M")
    public void selectSizeM() {

        products.optionSizeM.click();
    }

    @And("select the first product")
    public void selectTheFirstProduct() {

        products.productList.get(0).click();
    }
}
