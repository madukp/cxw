package org.cxw.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.cxw.pageobj.LoginPage;

public class LoginTest {

    private LoginPage loginPage;

    public LoginTest() {
        loginPage = new LoginPage();
    }

    @Given("^User launch the web browser$")
    public void user_launch_the_web_browser() {
        loginPage.launchBrowser();
    }

    @Then("^User log in as SuperAdmin$")
    public void user_login_as_super_admin() {
        loginPage.superAdminLogin();
        //quitDriver();
    }

    @Then("^User select the default Client and Project$")
    public void user_select_default_client_and_project() {

        try {
            loginPage.selectDefaultClient();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Then("^User logout$")
    public void user_logout() {
        try {
            loginPage.logout();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
