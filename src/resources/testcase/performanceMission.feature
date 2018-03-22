Feature: Performance Mission CRUD

  @createPerfMission
  Scenario: Create Performance Mission
    Given User launch the web browser
    Then User log in as SuperAdmin
    When User select the default Client and Project
    Then User Create a "URL" Performance Mission
    #Then : TODO
    #Then User logout