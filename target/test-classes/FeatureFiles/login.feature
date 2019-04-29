

@login @smoke
Feature: user should be able to login successfully
  Scenario: User should be able to login
    Given user is on the home page
    When  user  enter valid username and password click on login button
    Then user see welcome message


    @logout @smoke
      Scenario: user should be able to logout
      Given user is on the home page
      When  user  enter valid username and password click on login button
      And user click on logout button
      Then user is able to logout and navigate to login page

