package com.lean.pageobject.model.stepdefinitions;

import com.lean.pageobject.model.actions.*;
import com.qualitest.assessment.application.actions.*;
import com.lean.pageobject.model.states.ValidatesNameChangeSuccessMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ChangePersonalDetailsStepDefinitions {

    @Autowired
    private LaunchURL launchURL;

    @Autowired
    private ChoosesToSignInFromHeaderBar choosesToSignInFromHeaderBar;

    @Autowired
    private SignsInAsARegisteredUser signsInAsARegisteredUser;

    @Autowired
    private UpdatesFirstNameAndSavesTheChanges updatesFirstNameAndSavesTheChanges;

    @Autowired
    private ValidatesNameChangeSuccessMessage validatesNameChangeSuccessMessage;

    @Autowired
    private LogsOut logsOut;

    @Given("Nancy chooses to sign in from header")
    public void nancy_chooses_to_sign_in_from_header() {
        launchURL.toOnlineShop();
        choosesToSignInFromHeaderBar.intoTheShop();

    }
    @When("Nancy changes the first name")
    public void nancy_changed_the_first_name() {
        updatesFirstNameAndSavesTheChanges.toANewName();

    }
    @Then("Nancy can view the update and logout")
    public void nancy_can_view_the_update() {
        String successMessageActual = validatesNameChangeSuccessMessage.inTheAccount();
        logsOut.ofTheShop();
        Assert.assertEquals("This Should Fail", successMessageActual);

    }

}
