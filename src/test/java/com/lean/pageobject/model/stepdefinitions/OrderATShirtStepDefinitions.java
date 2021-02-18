package com.lean.pageobject.model.stepdefinitions;

import com.lean.pageobject.model.actions.*;
import com.lean.pageobject.model.states.ValidatesPriceOfTheItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderATShirtStepDefinitions {

    @Autowired
    private LaunchURL launchURL;

    @Autowired
    private SearchForProduct searchForProduct;

    @Autowired
    private SelectProduct selectProduct;

    @Autowired
    private AddProductToCart addProductToCart;

    @Autowired
    private ProceedToCheckout proceedToCheckout;

    @Autowired
    private ConfirmOrderOnSummary confirmOrderOnSummary;

    @Autowired
    private SignsInAsARegisteredUser signsInAsARegisteredUser;

    @Autowired
    private VerifiesBillingAndShippingAddress verifiesBillingAndShippingAddress;

    @Autowired
    private SelectsShippingAndTermsOfService selectsShippingAndTermsOfService;

    @Autowired
    private SelectsPaymentMethod selectsPaymentMethod;

    @Autowired
    private ConfirmsOrderAndViewsOrderHistory confirmsOrderAndViewsOrderHistory;

    @Autowired
    private ValidatesPriceOfTheItem validatesPriceOfTheItem;


    @Given("Nancy searches for a {string} in the online store")
    public void nancy_searches_for_a_in_the_online_store(String productName) {
        launchURL.toOnlineShop();
        searchForProduct.onTheSiteNamed(productName);
    }
    @When("Nancy makes the selection of a {string}")
    public void nancy_makes_the_selection_of_a(String productName) {
        selectProduct.named(productName);
    }
    @When("Nancy confirms the order")
    public void nancy_confirms_the_order() {
      addProductToCart.addsProductToCart();
      proceedToCheckout.proceedsToCheckout();

    }
    @When("Nancy verifies the order summary")
    public void nancy_verifies_the_order_summary() {
        confirmOrderOnSummary.confirmsOrderOnSummaryPage();
    }
    @When("Nancy signs in as a registered user")
    public void nancy_signs_in_as_a_registered_user() {
        signsInAsARegisteredUser.intoTheOnlineShop();
    }
    @When("Nancy verifies the billing and shipping addresses")
    public void nancy_verifies_the_billing_and_shipping_addresses() {
        verifiesBillingAndShippingAddress.forTheOrder();
    }
    @When("Nancy chooses a delivery option and accepts terms of service")
    public void nancy_chooses_a_delivery_option_and_accepts_terms_of_service() {
        selectsShippingAndTermsOfService.toContinue();
    }
    @When("Nancy chooses to pay by bank wire")
    public void nancy_chooses_to_pay_by_bank_wire() {
        selectsPaymentMethod.forTheOrder();
    }
    @When("Nancy navigates to order history page")
    public void nancy_navigates_to_order_history_page() {
        confirmsOrderAndViewsOrderHistory.forTheOrder();
    }
    @Then("Nancy can see her order in the history page")
    public void nancy_can_see_her_order_in_the_history_page() {
        String actualPrice = validatesPriceOfTheItem.purchased();
        Assert.assertEquals("$18.51", actualPrice);
    }

}
