Feature: TS001 Login Functionality

  Background: Open the Site and Navigate to Login Page
    Given go to "BaseURL"
    When click Sign In link
    Then page URL must contain "PartialLoginURL"

  @smoke
  Scenario: TC001 Successful Login
    When type login "username" into email box
    And type login "password" into password box
    And click login button
    Then welcome message must be displayed
    And close browser

  @smoke
  Scenario: TC002 Unsuccessful Login with Wrong Password
    When type login "wrongUsername" into email box
    And type login "password" into password box
    And click login button
    Then error message must be displayed
    And close browser

  # More negative scenarios will be added.