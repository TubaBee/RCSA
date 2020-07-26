Feature: Logging

  @smoke
  Scenario: Login
    Given I navigate to RCSA login page
    When I enter  valid username and invalid password
    Then I see error message