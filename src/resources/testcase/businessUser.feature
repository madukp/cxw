Feature: BusinessUser CRUD

 # @createBSUser
 # Scenario: Create Business user
 # Given User log in as SuperAdmin
 # When User select the default Client and Project
 # Then User creates a business user

 # @searchBSUser
  # Scenario: Search Business user
  #  Given User log in as SuperAdmin
  #  When User select the default Client and Project
  #  Then User creates a business user
  #  Then User search a business user with email "spcicx@gmail.com"

  @deleteBSUser
  Scenario: Delete Business user
    Given User launch the web browser
    Then User log in as SuperAdmin
    When User select the default Client and Project
    When User creates a business user
    Then User search a business user with email "spcicx@gmail.com"
    Then User edits a business user
    Then User deletes a business user "spcicx@gmail.com"
    Then User quit the browser
