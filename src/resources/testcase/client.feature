Feature: Client CRUD

  @createClient
  Scenario: Creating a Client
    Given User log in as SuperAdmin
    When User select the default Client and Project
    Then User creates a "Sub Level 3" client
