@ad
Feature: Add a department

  Background: The user is on home page

  Scenario: User should be able to add a department

    When the user writes "Company Structure" in the search box and hits the enter
    Then user should be able to display the company structure
    When user clicks on "Add department"
    When user writes "department name" in the box and clicks on "add"
    Then user should be able to display the new department on the page


