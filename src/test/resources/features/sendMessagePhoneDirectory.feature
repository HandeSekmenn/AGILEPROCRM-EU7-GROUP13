@smpd

Feature: Send message from phone directory

  Background: The user is on home page

  Scenario: User should be able to send message to employee from the telephone directory

    When the user writes telephone directory in the searchbox and hits enter
    Then the user should be navigated to the telephone directory webpage
    When the user clicks on "Arben Istrefi".
    Then the user should be navigated to the emplooyee's page
    When the user clicks on send message
    And writes "hello" in the message box and hits the enter
    Then the message should have been sent




