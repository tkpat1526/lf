
@smoke @category
Feature: User wants to check all the categories in home page working or not.
  Scenario Outline: user should be able to click on category list
    Given user is on the home page
    When  user  enter  username and password click on login button
    And  click  <link>
    Then  should be able to see <Page>

    Examples:
        |     link          |      Page   |
        | Dashboard         |  Dashboard     |
        | Visitor List      |  Visitor List   |
        | Leads             |  Leads          |
        | Messenger         |  Messenger Page      |
        | Search            |  Search Page         |
        | Academy           |  Academy Page        |
        | Accelerate        |  Accelerate page     |

  @reports @smoke @category
  Scenario: User wants to navigate to dropdown menus
    Given user is on the home page
    When user  enter valid username and password click on login button
    And user hover to Reports page
    Then user click  categories button then user able to see categories page
  @setup @smoke @category
  Scenario: User wants to navigate to setup page
    Given user is on the home page
    When user  enter valid username and password click on login button
    And user hover to setup page
    Then user click  account setting button then user able to see account setting page
    @support @smoke @category
  Scenario: User wants to navigate to dropdown menus
    Given user is on the home page
    When user  enter valid username and password click on login button
    And user hover to support page
    Then user click  raise a ticket button then user able to see raise a ticket  page




