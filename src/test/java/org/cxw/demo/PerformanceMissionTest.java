package org.cxw.demo;

import cucumber.api.java.en.Then;
import org.cxw.pageobj.LoginPage;
import org.cxw.pageobj.PerformanceMissionPageURL;
import org.cxw.setup.SetUp;

public class PerformanceMissionTest extends SetUp{

    @Then("^User Create a Performance Mission$")
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
}
