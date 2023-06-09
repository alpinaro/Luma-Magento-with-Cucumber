package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class CheckoutPage {

    public CheckoutPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input")
    public WebElement inputStreet;

    @FindBy (xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input")
    public WebElement inputCity;

    @FindBy (xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select")
    public WebElement inputState;

    @FindBy (xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")
    public WebElement inputPostalCode;

    @FindBy (xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select")
    public WebElement inputCountry;

    @FindBy (xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input")
    public WebElement inputPhone;

    @FindBy (xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
    public WebElement buttonNext;
}
