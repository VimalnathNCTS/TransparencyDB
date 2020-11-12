package UK.GOV.BEIS.SCTDB.Framework.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/features/POSTSearchResultsAPI.feature"}
        ,glue= "UK/GOV/BEIS/SCTDB/Framework/stepdefinition/ui/AdminPortal")
public class SearchResultsAPI {
}

