@test
  Feature:Sending Message
    Given user is on the home page

    Scenario:Helpdesk user can send message
      When the user clicks on send message, message box should be enabled
      Then user writes something in the box
      And the user clicks on send
      And the user should be able to display the message on the home page

    Scenario: HR user can send message
      When the user clicks on send message, message box should be enabled
      Then user writes something in the box
      And the user clicks on send
      And the user should be able to display the message on the home page

    Scenario: Marketing user can send message
      When the user clicks on send message, message box should be enabled
      Then user writes something in the box
      And the user clicks on send
      And the user should be able to display the message on the home page
