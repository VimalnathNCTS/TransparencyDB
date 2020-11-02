package com.BEISTransparencyDB.ui.stepdefinition.UI.Admin.Portal;

import com.BEISTransparencyDB.pagefactory.UIAdminPortal.Userinfo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;

public class Login {
    Userinfo userinfo;

    @Given("^I enter a valid emailID \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_a_valid_emailID(String emailID, String password) throws InterruptedException {
        userinfo.open();
        userinfo.setEmailID (emailID);
        userinfo.setPassword(password);
    }
    @And("^I click on SignIn")
    public void i_click_on_SignIn () {
        userinfo.signIn();
    }
    @Then("I will be able to login successfully")
    public void i_will_be_able_to_login_successfully () {
        userinfo.verifyLogin();
}
}
