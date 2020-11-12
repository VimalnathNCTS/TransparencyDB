package UK.GOV.BEIS.SCTDB.Framework.stepdefinition.ui.AdminPortal;

import UK.GOV.BEIS.SCTDB.Framework.pagefactory.api.API;
import UK.GOV.BEIS.SCTDB.Framework.utilities.Reusable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchAPI_Steps {
    Reusable ReusableObj;

    @Steps
    API APIobj;

    @Given("a POST {string} endpoint")
    public void i_have_a_valid_POST_endpoint(String EndPoint) {
        APIobj.setEndPoint(EndPoint);
    }


    @When("I send a request with Empty JSON body")
    public void iSendProperRequestWithEmptyPayload() {
        APIobj.getResponseForPOST("{}");
    }

    @When("I send a request with JSON body")
    public void iSendProperRequest() {
            APIobj.getResponseForPOST("{\"beneficiaryName\": \"Durhams Medical Trust\"}");
    }

    @When("I send a request with JSON body from {string}")
    public void iSendProperRequestWithPayload(String PayloadPath) {
        System.out.println(PayloadPath);
        //System.out.println(System.getProperty("java.class.path").replace(':', '\n'));
       // String Payload = ReusableObj.readFileContents(PayloadPath);

        try {
            String Payload = ReusableObj.readFileContents(PayloadPath);
            System.out.println(Payload);
            APIobj.getResponseForPOST(Payload);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I will be getting the successful {int} for POST searchResult")
    public void iWillBeGettingExpectedResponse(int StatusCode) {
        APIobj.validateResponse(StatusCode);
    }

}
