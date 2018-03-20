package org.cxw.demo;

import org.cxw.pageobj.BusinessUserPage;
import cucumber.api.java.en.Then;

public class BusinessUserTest {

    private BusinessUserPage businessUserPage;

    public BusinessUserTest() {
        businessUserPage = new BusinessUserPage();
    }

    @Then("^User creates a business user$")
    public void create_business_user() {
        // Write code here that turns the phrase above into concrete actions

        businessUserPage.CreateBusinessUser();
    }


}
