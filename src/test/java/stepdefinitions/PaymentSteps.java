package stepdefinitions;

import io.cucumber.java.en.When;
import pages.PaymentPage;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class PaymentSteps {

    PaymentPage payment = new PaymentPage();

    @When("click Place Order button")
    public void clickPlaceOrderButton() {

        payment.buttonPlaceOrder.click();
    }
}