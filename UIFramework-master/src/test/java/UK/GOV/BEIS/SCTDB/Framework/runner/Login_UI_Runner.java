package UK.GOV.BEIS.SCTDB.Framework.runner;

import UK.GOV.BEIS.SCTDB.Framework.utilities.BrowserStackSerenityTest;
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/features/Login.feature"}
        ,glue= "UK/GOV/BEIS/SCTDB/Framework/stepdefinition/ui/AdminPortal")
public class Login_UI_Runner extends BrowserStackSerenityTest {

}
