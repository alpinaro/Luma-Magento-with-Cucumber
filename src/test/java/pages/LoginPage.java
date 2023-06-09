package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Log In Forms
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "pass")
    public WebElement inputPassword;

    @FindBy(id = "send2")
    public WebElement buttonLogin;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
    public WebElement errorMessage;
}