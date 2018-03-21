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

        try {
            clientPage.clickLeftNavAdministration();
            clientPage.clickLeftNavClients();
            clientPage.clickCreateNewClientBtn();
            clientPage.fillClientDetails();
            clientPage.selectClientSubLevel(subLevel);
            clientPage.selectMissionLimitType("CLIENT");
            clientPage.typeTermsAndRules();
            clientPage.clickSaveClient();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
