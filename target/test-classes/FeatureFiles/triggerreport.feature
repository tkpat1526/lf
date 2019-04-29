@trigger
  Feature: user should be able to add new trigger reports
    Scenario: user is bale to add new trigger reports
      Given user is on the home page
      When user  enter valid username and password click on login button
      And user hover to  Setup page and select Trigger Reports
      And user enter Report name
      And select real time Email notification and select Page data
      And Select Report Recipients
      And select Filter
      And select auto assign,auto categories,auto creat leads,auto purchase contacts
      And click on save reports
      Then user will see trigger report created sucessfully message

