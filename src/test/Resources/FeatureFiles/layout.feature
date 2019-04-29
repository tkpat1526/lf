

Feature:user is able to change the layout
  @layout

  Scenario: user should be able to change layout
  Given user  enter valid username and password click on login button
  When user click on Dashboard
  And click on setup
  And uesr click on Layout
    Then user can able to change layout

