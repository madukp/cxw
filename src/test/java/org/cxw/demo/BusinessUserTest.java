package org.cxw.demo;

import org.cxw.pageobj.BusinessUser;
import org.cxw.pageobj.LoginPage;
import org.cxw.setup.SetUp;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BusinessUserTest extends SetUp {

    @Then("^Super Admin creates a business user$")
    public void create_business_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();
        BusinessUser bu = new BusinessUser();
        bu.CreateBusinessUser();

        throw new PendingException();
    }


}
