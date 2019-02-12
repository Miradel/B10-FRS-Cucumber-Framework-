package com.cybertek.step_defs;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.InventoryPage;
import com.cybertek.utilities.BrowserUnit;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.sl.In;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SmokeStepDef {
    @Then("the mamnager should see Inventory tab on navigation bar")
    public void the_mamnager_should_see_Inventory_tab_on_navigation_bar() {
        HomePage homePage = new HomePage();

        BrowserUnit.wait(3);
        System.out.println(homePage.inventoryText.getText());

        Assert.assertTrue(homePage.inventoryText.isDisplayed());

    }

    @When("the manager clicks Inventory tab on the navigation tab")
    public void the_manager_clicks_Inventory_tab_on_the_navigation_tab() {

        HomePage homePage = new HomePage();
        BrowserUnit.wait(5);
        homePage.inventoryText.click();

    }

    @Then("the manager should see following sections on the left nav bar:")
    public void the_manager_should_see_following_sections_on_the_left_nav_bar(List<String> expSect) {

        InventoryPage inventoryPage = new InventoryPage();


        for(WebElement section: inventoryPage.actualSections ){
            System.out.println(section.getText());
        }

        List<String> sc = new ArrayList<>();
        sc.addAll(expSect);
        System.out.println(sc);

        Assert.assertEquals(expSect,sc);
    }
}
