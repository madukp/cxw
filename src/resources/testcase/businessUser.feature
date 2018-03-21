Feature: BusinessUser CRUD

  @createBSUser
  Scenario: Create Business user
    Given User log in as SuperAdmin
    When User select the default Client and Project
    Then User creates a business user

  @searchBSUser
  Scenario: Search Business user
    Given User log in as SuperAdmin
    When User select the default Client and Project
    Then User search a business user with email "spcicx@gmail.com"