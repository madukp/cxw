Feature: Login

  @loginAsSuperAdmin
  Scenario: Login as Super admin
    Given User launch the web browser
    When User log in as SuperAdmin
    Then User select the default Client and Project
    Then User logout

  @logout
  Scenario: Logout
    Given User launch the web browser
    When User log in as SuperAdmin
    When User select the default Client and Project
    Then User logout