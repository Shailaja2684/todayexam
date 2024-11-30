Feature: Create Gmail Account

  Scenario: User creates a new Gmail account

    Given I navigate to the Gmail sign-up page
    When I fill in the account details
    Then I should successfully create a Gmail account