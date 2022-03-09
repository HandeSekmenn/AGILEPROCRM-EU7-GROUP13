@cs
Feature: Display company structure

  Background: The user is on the home page

  Scenario: User should be able to display company structure

    When the user writes "Company Structure" in the search box and hits the enter
    Then user should be able to display the company structure

    Examples:

      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |