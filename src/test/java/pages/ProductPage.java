package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class ProductPage {

    public ProductPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "option-label-size-143-item-168")
    public WebElement productSizeM;

    @FindBy (id = "option-label-color-93-item-50")
    public WebElement productColorBlue;

    @FindBy (id = "product-addtocart-button")
    public WebElement productAddToCart;
}
