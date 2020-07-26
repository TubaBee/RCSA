Feature:Assignment

  Background: Navigating to dashboard

    Given I login to RCSAConnect
    Then I click on the course page and turn the editing on

  Scenario Outline: Adding Assignment

    Given I choose the of "<Week>" for assignment and navigate to assignment page
    And And I add the details of the assignment starting on "8" ending on "15"
    When I click save button
    Then I see the assignment created
    Examples:
      | Week              |
      | May 4 - May 10    |
#      | May 11 - May 17   |
#      | May 18 - May 1024 |