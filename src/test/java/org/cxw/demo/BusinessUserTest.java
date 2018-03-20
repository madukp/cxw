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

        try {
            businessUserPage.CreateBusinessUser();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Then("^User search a business user with email \"([^\"]*)\"$")
    public void search_business_user(String email) {

        try {
            businessUserPage.SearchBusinessUser(email);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
