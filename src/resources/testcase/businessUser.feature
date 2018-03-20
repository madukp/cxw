Feature: BusinessUser CRUD

  @createBSUser
  Scenario: Create Business user
    Given User log in as SuperAdmin
    When User select the default Client and Project
    Then User creates a business user