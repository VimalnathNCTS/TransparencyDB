package com.BEISTransparencyDB.runner;

import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/UI_Admin_Portal/Login.feature"}
        ,glue= "com/BEISTransparencyDB/ui/stepdefinition/UI/Admin/Portal/"

)
public class Login  extends BrowserStackSerenityTest {

}
