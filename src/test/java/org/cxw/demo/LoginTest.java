package org.cxw.demo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.cxw.pageobj.LoginPage;
import org.cxw.setup.SetUp;

public class LoginTest extends SetUp {

    @Given("^User log in as SuperAdmin$")
    public void user_login_as_super_admin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();

        //quitDriver();

        throw new PendingException();
    }
}
