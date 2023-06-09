package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Top Menu (Account)
    @FindBy (partialLinkText = "Sign In")
    public WebElement linkSignIn;

    @FindBy (xpath = "//li[@class=\"greet welcome\"]")
    public WebElement welcomeMessage;

    // Cart
    @FindBy (xpath = "//div[@class=\"minicart-wrapper\"]/a/span[2]/span[1]")
    public WebElement cartQuantity;

    @FindBy (id = "top-cart-btn-checkout")
    public WebElement buttonCheckout;

    // Main Menu
    @FindBy (id = "ui-id-3")
    public WebElement optionNew;

    @FindBy (id = "ui-id-4")
    public WebElement optionWomen;

    @FindBy (id = "ui-id-5")
    public WebElement optionMen;

    @FindBy (id = "ui-id-6")
    public WebElement optionGear;

    @FindBy (id = "ui-id-7")
    public WebElement optionTraining;

    @FindBy (id = "ui-id-8")
    public WebElement optionSale;

    @FindBy (id = "ui-id-9")
    public WebElement optionWomenTops;

    @FindBy (id = "ui-id-10")
    public WebElement optionWomenBottoms;

    @FindBy (id = "ui-id-11")
    public WebElement optionWomenTopsJackets;

    @FindBy (id = "ui-id-12")
    public WebElement optionWomenTopsHoodies;

    @FindBy (id = "ui-id-13")
    public WebElement optionWomenTopsTees;

    @FindBy (id = "ui-id-14")
    public WebElement optionWomenTopsTanks;

    @FindBy (id = "ui-id-15")
    public WebElement optionWomenBottomsPants;

    @FindBy (id = "ui-id-16")
    public WebElement optionWomenBottomsShorts;

    @FindBy (id = "ui-id-17")
    public WebElement optionMenTops;

    @FindBy (id = "ui-id-18")
    public WebElement optionMenBottoms;

    @FindBy (id = "ui-id-19")
    public WebElement optionMenTopsJackets;

    @FindBy (id = "ui-id-20")
    public WebElement optionMenTopsHoodies;

    @FindBy (id = "ui-id-21")
    public WebElement optionMenTopsTees;

    @FindBy (id = "ui-id-22")
    public WebElement optionMenTopsTanks;

    @FindBy (id = "ui-id-23")
    public WebElement optionMenBottomsPants;

    @FindBy (id = "ui-id-24")
    public WebElement optionMenBottomsShorts;

    @FindBy (id = "ui-id-25")
    public WebElement optionGearBags;

    @FindBy (id = "ui-id-26")
    public WebElement optionGearFitness;

    @FindBy (id = "ui-id-27")
    public WebElement optionGearWatches;

    @FindBy (id = "ui-id-28")
    public WebElement optionTrainingVideo;
}