package lf;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends Utils {
    LogInButton login = new LogInButton();
    HomePage hm = new HomePage();
    Dashboard db = new Dashboard();
    Setup sp = new Setup();
    ReportsPage rp = new ReportsPage();
    SupportPage supportpage = new SupportPage();

    /////////////////////////Login //////////////////////////////////////////////////////

    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() {
    }
    @When("^user  enter valid username and password click on login button$")
    public void userEnterValidUsernameAndPasswordClickOnLoginButton() {
        login.userDetail();

    }
        @Then("^user see welcome message$")
    public void userSeeWelcomeMessage() { }


/////////////////////////////////////logout///////////////////////////////////
    @And("^user click on logout button$")
    public void userClickOnLogoutButton() {login.userLogOut();}
    @Then("^user is able to logout and navigate to login page$")
    public void userIsAbleToLogoutAndNavigateToLoginPage() { login.verifyUserLogout(); }

    /////////////////////////////// Layout//////////////////////////////////////////////////////////////////
   @When("^click on setup$")
    public void click_on_setup() { db.setup(); }

    @When("^uesr click on Layout$")
    public void uesr_click_on_Layout() { }




    @Then("^user can able to change layout$")
    public void user_can_able_to_change_layout() { db.changeLayout();

    }




    // all the pages
    @When("^user  enter  username and password click on login button$")
    public void userEnterUsernameAndPasswordClickOnLoginButton() {
       login.userDetail();
   }

    @And("^click  ([^\"]*)$")
    public void userClickOnLink(String link) {
        waitForElementToBeDisplay(By.linkText(link),2000);
        click_Element(By.linkText(link));
    }

    @Then("^should be able to see ([^\"]*)$")
    public void userShouldBeAbleToSeeTitle(String title) {

        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(driver.getCurrentUrl().contains(url), "Test case fail");
        login.userLogOut();

    }
/////////////////////////// add trigger reports////////////////////////////////////
    @And("^user hover to  Setup page and select Trigger Reports$")
    public void userHoverToSetupPageAndSelectTriggerReports() {
        hm.setupPage();
        sp.triggerReport();


    }

    @And("^user enter Report name$")
    public void userEnterReportName() {
        sp.reportName();


    }

    @And("^select real time Email notification and select Page data$")
    public void selectRealTimeEmailNotificationAndSelectPageData() {
        sp.reportType();

    }

    @And("^Select Report Recipients$")
    public void selectReportRecipients() {
        sp.recipients();
        sp.enterNewEmailAddress();

    }

    @And("^select Filter$")
    public void selectFilter() {

    }

    @And("^select auto assign,auto categories,auto creat leads,auto purchase contacts$")
    public void selectAutoAssignAutoCategoriesAutoCreatLeadsAutoPurchaseContacts() {

    }

    @And("^click on save reports$")
    public void clickOnSaveReports() {

    }

    @Then("^user will see trigger report created sucessfully message$")
    public void userWillSeeTriggerReportCreatedSucessfullyMessage() {
    }

////////////////////////////////// Report page///////////////////////////////////////////////////////////////////////
    @And("^user hover to Reports page$")
    public void userHoverToReportsPage() {
        hm.reportsPage();
    }

    @Then("^user click  categories button then user able to see categories page$")
    public void userClickCategoriesButtonThenUserAbleToSeeCategoriesPage() {

        rp.checkReportsPageIsOpenOrNot();
        login.userLogOut();
    }
    ////////////////////////////Setup  page \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @And("^user hover to setup page$")
    public void userHoverToSetupPage() { hm.setupPage();}

    @Then("^user click  account setting button then user able to see account setting page$")
    public void userClickAccountSettingButtonThenUserAbleToSeeAccountSettingPage() { sp.checkSetupPageIsOpenOrNot();
    login.userLogOut();}

////////////////////////////////////////support page ///////////////////////////////////////////////////
    @And("^user hover to support page$")
    public void userHoverToSupportPage() {
        hm.supportpage();
    }

    @Then("^user click  raise a ticket button then user able to see raise a ticket  page$")
    public void userClickRaiseATicketButtonThenUserAbleToSeeRaiseATicketPage() {
        supportpage.checkSupportPageIsOpenOrNot();
        login.userLogOut();
    }



}





