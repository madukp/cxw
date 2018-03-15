package org.cxw.demo;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.cxw.pageobj.ClientPage;
import org.cxw.pageobj.LoginPage;
import org.cxw.setup.SetUp;

public class ClientTest extends SetUp{

    @Then("^Super Admin creates a client$")
    public void create_business_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();
        ClientPage cp = new ClientPage();
        cp.clickLeftNavAdministration();
        cp.clickLeftNavClients();
        cp.clickCreateNewClientBtn();
        cp.fillClientDetails();
        cp.clickSaveClient();

        throw new PendingException();
    }

}
