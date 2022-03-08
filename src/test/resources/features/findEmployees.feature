@fe

Feature: Find employees

  Background: The user is on home page

  Scenario: User should be able to find employees by search box

    When user writes employees in searchbox and hits the enter
    Then the user should be navigated to the company employees page
    When user clicks on find employee
    Then the user should be able to display the find employee page
    When the user write "Murad" to the search box on the page and hits the enter
    Then the user should be able to display "Murad"