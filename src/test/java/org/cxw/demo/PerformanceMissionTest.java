package org.cxw.demo;

import cucumber.api.java.en.Then;
import org.cxw.pageobj.PerformanceMissionPage;

public class PerformanceMissionTest {

    private PerformanceMissionPage PerfMissionPage;

    public PerformanceMissionTest() {
        PerfMissionPage = new PerformanceMissionPage();
    }

    @Then("^User Create a \"([^\"]*)\" Performance Mission$")
    public void user_create_projectTeam_perf_mission(String distribType) {

        try {
            PerfMissionPage.clickLeftNavMissions();
            PerfMissionPage.clickLeftNavProjectTeam();
            PerfMissionPage.clickPerfMissionBtn();
            PerfMissionPage.typePerfMissiontitle();
            PerfMissionPage.selectDistrbutionType(distribType);
            PerfMissionPage.clickSaveMission();
            PerfMissionPage.selectAction();
            PerfMissionPage.gotoStepTwo();
            PerfMissionPage.typeParticipantInstructions();
            PerfMissionPage.selectMediaUpload();
            PerfMissionPage.typeMediaInstructions();
            PerfMissionPage.gotoStepThree();
            PerfMissionPage.typeThankYouMessage();
            PerfMissionPage.gotoStepFive();
            PerfMissionPage.clickGenerateURL();
            PerfMissionPage.gotoURLmission();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
