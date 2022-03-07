@wip
Feature: Uploading file

  Scenario Outline: upload as <user>
    Given the user is on the home page
    When the user clicks on send message box, the box should be enabled
    |userType|<user>|
    Then user clicks on send file button

    Examples:
      |user   |
      |helpdesk|
      |hr      |
      |marketing|




