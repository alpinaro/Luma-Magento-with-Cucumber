package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.CheckoutPage;
import utilities.ConfigReader;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class CheckoutSteps {

    CheckoutPage checkout = new CheckoutPage();

    @When("type {string} into Street Address box")
    public void typeIntoStreetAddressBox(String street) {

        checkout.inputStreet.sendKeys(ConfigReader.getProperty(street));
    }

    @And("type {string} into City Address box")
    public void typeIntoCityAddressBox(String city) {

        checkout.inputCity.sendKeys(ConfigReader.getProperty(city));
    }

    @And("select {string} as state")
    public void selectAsState(String state) {

        Select stateSelect = new Select(checkout.inputState);
        stateSelect.selectByValue(ConfigReader.getProperty(state));
    }

    @And("type {string} into Postal Code Address box")
    public void typeIntoPostalCodeAddressBox(String postalCode) {

        checkout.inputPostalCode.sendKeys(ConfigReader.getProperty(postalCode));
    }

    @And("select {string} as country")
    public void selectAsCountry(String country) {

        Select countrySelect = new Select(checkout.inputCountry);
        countrySelect.selectByValue(ConfigReader.getProperty(country));
    }

    @And("type {string} into Phone Address box")
    public void typeIntoPhoneAddressBox(String phone) {

        checkout.inputPhone.sendKeys(ConfigReader.getProperty(phone));
    }

    @And("click Next button")
    public void clickNextButton() {

        checkout.buttonNext.click();
    }
}