package com.cybertek.step_defs;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUnit;
import com.cybertek.utilities.ConfigReader;
import com.cybertek.utilities.Driver;
import com.sun.org.apache.bcel.internal.generic.LNEG;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;

public class loginStepDefs {
    @Given("manager is on the landing page")
    public void manager_is_on_the_landing_page() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("manager clicks on BriteErpDemo button")
    public void manager_clicks_on_BriteErpDemo_button() {

        LandingPage landingPage = new LandingPage();
        landingPage.briteErpDemoButton.click();
    }

    @Then("title should be Login Website localhost")
    public void title_should_be_Login_Website_localhost() {

        BrowserUnit.wait(4);

        Assert.assertEquals("Odoo",Driver.getDriver().getTitle());

    }

    @Then("the database should be {string}")
    public void the_database_should_be(String expectedTest) {

        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(expectedTest,loginPage.databaseText.getAttribute("value"));

    }

    @When("the manager enters vaild email address")
    public void the_manager_enters_vaild_email_address() {
        LoginPage loginPage = new LoginPage();
        loginPage.emailInput.sendKeys(ConfigReader.getProperty("manager-username"));

    }

    @When("the manager enters vaild password")
    public void the_manager_enters_vaild_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("manager-password"));

    }

    @When("the manager cilicks Login button")
    public void the_manager_cilicks_Login_button() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();
    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Odoo() {

        Assert.assertEquals("Odoo",Driver.getDriver().getTitle());

    }

    // User

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
      Driver.getDriver().get(ConfigReader.getProperty("url"));
        BrowserUnit.wait(2);
    }

    @When("user clicks on BritErpDemo button")
    public void user_clicks_on_BritErpDemo_button() {

        LandingPage landingPage = new LandingPage();
        landingPage.briteErpDemoButton.click();
        BrowserUnit.wait(4);

    }

    @Then("title should be {string}")
    public void title_should_be(String expectedTitle) {

        Assert.assertEquals("Login | Website localhost",Driver.getDriver().getTitle());
    }




    @When("the user enters vaild email address")
    public void the_user_enters_vaild_email_address() {
       LoginPage loginPage = new LoginPage();
       loginPage.emailInput.sendKeys(ConfigReader.getProperty("user-username"));
    }

    @When("the user enters vaild password")
    public void the_user_enters_vaild_password() {
        LoginPage loginPage = new LoginPage();
        BrowserUnit.wait(2);
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("user-password"));
    }

    @When("the user clicks log in button")
    public void the_user_clicks_log_in_button() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();
    }
}
