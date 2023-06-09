package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class ProductsPage {

    public ProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Shopping Options
    @FindBy (xpath = "//*[@id=\"narrow-by-list\"]/div[2]")
    public WebElement optionSize;

    @FindBy (xpath = "//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[3]/div")
    public WebElement optionSizeM;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li")
    public List<WebElement> productList;
}
