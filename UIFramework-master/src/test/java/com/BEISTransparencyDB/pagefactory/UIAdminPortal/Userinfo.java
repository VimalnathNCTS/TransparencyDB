package com.BEISTransparencyDB.pagefactory.UIAdminPortal;

import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

@DefaultUrl("http://transparency-admin.azurewebsites.net/")
public class Userinfo extends PageObject {

    @FindBy(xpath = "//input[@id='email_address']")
    @CacheLookup
    WebElement emailID;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    @CacheLookup
    WebElement SignIn;

    @FindBy(xpath = "//h1[contains(text(),'My subsidy awards')]")
    @CacheLookup
    WebElement ValidateTitle;

    public void setEmailID (String ID){
       emailID.sendKeys(ID);
    }

    public void setPassword (String pass) {
       password.sendKeys(pass);
    }

    public void signIn() {
        SignIn.click ();
    }

    public void verifyLogin() {
    assertEquals("Login failed", "My subsidy awards", ValidateTitle.getText());
    }
}