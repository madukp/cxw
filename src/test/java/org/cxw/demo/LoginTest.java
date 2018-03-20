package org.cxw.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.cxw.pageobj.LoginPage;

public class LoginTest {

    private LoginPage loginPage;

    public LoginTest() {
        loginPage = new LoginPage();
    }

    @Given("^User log in as SuperAdmin$")
    public void user_login_as_super_admin() {
        loginPage.superAdminLogin();
        //quitDriver();
    }

    @Then("^User select the default Client and Project$")
    public void user_select_default_client_and_project() {
        loginPage.selectDefaultClient();
        //quitDriver();
    }

}
