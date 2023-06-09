package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reusable;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class MainSteps {

    Actions actions = new Actions(Driver.getDriver());
    HomePage home = new HomePage();

    @When("go to {string}")
    public void goTo(String URL) {

        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }

    @When("click Sign In link")
    public void clickSignInLink() {

        home.linkSignIn.click();
    }

    @When("go to Women option")
    public void goToWomenOption() {

        actions.moveToElement(home.optionWomen).build().perform();
    }

    @When("click to Cart")
    public void clickToCart() {

        home.cartQuantity.click();
    }

    @And("click Proceed to Checkout button")
    public void clickProceedToCheckoutButton() {

        home.buttonCheckout.click();
    }

    @And("go to Tops option")
    public void goToTopsOption() {

        actions.moveToElement(home.optionWomenTops).build().perform();
    }

    @And("click Jackets option")
    public void clickJacketsOption() {

        home.optionWomenTopsJackets.click();
    }

    @And("close browser")
    public void closeBrowser() {

        Driver.closeDriver();
    }

    @And("go to the main frame")
    public void goToTheMainFrame() {

        Driver.getDriver().switchTo().defaultContent();
    }

    @And("wait for {int} seconds")
    public void waitForSeconds(int seconds) {

        Reusable.wait(seconds);
    }

    @Then("page URL must be {string}")
    public void urlIs(String pageURL) {

        Assert.assertEquals(ConfigReader.getProperty(pageURL), Driver.getDriver().getCurrentUrl());
    }

    @Then("page URL must contain {string}")
    public void urlContains(String partialURL) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty(partialURL)));
    }

    @Then("the cart must contain {int} product")
    public void theCartMustContainProduct(int quantity) {

        Assert.assertEquals(String.valueOf(quantity), home.cartQuantity.getText());
    }
}