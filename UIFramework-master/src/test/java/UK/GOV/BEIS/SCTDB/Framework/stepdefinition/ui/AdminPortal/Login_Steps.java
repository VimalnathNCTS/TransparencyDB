package UK.GOV.BEIS.SCTDB.Framework.stepdefinition.ui.AdminPortal;

import UK.GOV.BEIS.SCTDB.Framework.pagefactory.ui.adminportal.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {

    LoginPage userinfo;

    @Given("I enter a valid emailID {string} and password {string}")
    public void i_enter_a_valid_emailID(String emailID, String password) {
        userinfo.open();
        userinfo.setEmailID (emailID);
        userinfo.setPassword(password);
    }
    @When("^I click on SignIn")
    public void i_click_on_SignIn () {
        userinfo.signIn();
    }
    @Then("I will be able to login successfully")
    public void i_will_be_able_to_login_successfully () {
        userinfo.verifyLogin();
}
}
