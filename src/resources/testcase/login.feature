Feature: Login

  @loginAsSuperAdmin
  Scenario: Login as Super admin
    Given User launch the web browser
    Then User log in as SuperAdmin
    When User select the default Client and Project