package org.cxw.demo;

import cucumber.api.java.en.Then;
import org.cxw.pageobj.ClientPage;

public class ClientTest {

    private ClientPage clientPage;

    public ClientTest() {
        clientPage = new ClientPage();
    }

    @Then("^User creates a \"([^\"]*)\" client$")
    public void create_business_user(String subLevel) {
        // Write code here that turns the phrase above into concrete actions

        clientPage.clickLeftNavAdministration();
        clientPage.clickLeftNavClients();
        clientPage.clickCreateNewClientBtn();
        clientPage.fillClientDetails();
        clientPage.selectClientSubLevel(subLevel);
        clientPage.selectMissionLimitType("CLIENT");
        clientPage.typeTermsAndRules();
        clientPage.clickSaveClient();
    }

}
