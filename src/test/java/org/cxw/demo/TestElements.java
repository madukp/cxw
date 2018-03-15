package org.cxw.demo;

import org.cxw.pageobj.BusinessUser;
import org.cxw.pageobj.ClientPage;
import org.cxw.pageobj.LoginPage;
import org.cxw.pageobj.PerformanceMissionPageURL;
import org.cxw.setup.*;
import org.junit.Test;

public class TestElements extends SetUp {

    @Test
    public void user_navigated_to_CXW() {
        try {
            setupDriver();
        } catch (Exception ex) {
        }

    }

    @Test
    public void super_admin_login() {
        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();
        quitDriver();
    }

    @Test
    public void create_business_user(){
        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();
        BusinessUser bu = new BusinessUser();
        bu.CreateBusinessUser();
    }

    @Test
    public void user_create_projectTeam_perf_mission() {
        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();

        PerformanceMissionPageURL prfm = new PerformanceMissionPageURL();
        prfm.clickLeftNavMissions();
        prfm.clickLeftNavProjectTeam();
        prfm.clickPerfMissionBtn();
        prfm.typePerfMissiontitle();
        prfm.selectDistrbutionType("URL");
        prfm.clickSaveMission();
        prfm.selectAction();
        prfm.gotoStepTwo();
        prfm.typeParticipantInstructions();
        prfm.selectMediaUpload();
        prfm.typeMediaInstructions();
        prfm.gotoStepThree();
        prfm.typeThankYouMessage();
        prfm.gotoStepFive();
        prfm.clickGenerateURL();
        prfm.gotoURLmission();
    }

    @Test
    public void user_create_a_client() {
        setupDriver();
        LoginPage lp = new LoginPage();
        lp.superAdminLogin();

        ClientPage cl = new ClientPage();
        cl.clickLeftNavAdministration();
        cl.clickLeftNavClients();
        cl.clickCreateNewClientBtn();
    }
}
