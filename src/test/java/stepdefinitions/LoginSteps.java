package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Reusable;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class LoginSteps {

    LoginPage login = new LoginPage();
    HomePage home = new HomePage();

    @When("type login {string} into email box")
    public void typeLoginIntoEmailBox(String credential) {

        login.inputEmail.sendKeys(ConfigReader.getProperty(credential));
    }

    @When("type login {string} into password box")
    public void typeLoginIntoPasswordBox(String credential) {

        login.inputPassword.sendKeys(ConfigReader.getProperty(credential));
    }

    @When("click login button")
    public void clickLoginButton() {

        login.buttonLogin.click();
    }

    @Then("welcome message must be displayed")
    public void welcomeMessageMustBeDisplayed() {

        Reusable.wait(5);
        Assert.assertEquals(ConfigReader.getProperty("welcomeMessage"), home.welcomeMessage.getText());
    }

    @Then("error message must be displayed")
    public void errorMessageMustBeDisplayed() {

        Reusable.wait(5);
        Assert.assertEquals(ConfigReader.getProperty("loginErrorMessage"), login.errorMessage.getText());
    }
}