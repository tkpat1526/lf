package lf;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;

public class Setup extends Utils
{
    LoadProp loadProp = new LoadProp();
    By _accountsetting =By.xpath("//ul[@id=\"menu\"]/li[7]/div/ul/li[1]");
    By _triggerreports = By.xpath("//ul[@id=\"menu\"]//li[7]/div/ul/li[15]");
    By _reportname = By.id("ReportName");
    By _realtimenotification = By.xpath("//input[@id=\"Mode\"]");
    By _pagedata =By.xpath("//div[@class=\"full-page-data-container\"]/span[1]");
    By _receipients = By.xpath("//div[@id=\"reportRecipientsControl\"]/div[2]/div[2]/div[1]/div");
    By _newemailaddress = By.xpath("//ul[@id=\"emailAddresses_listbox\"]//li[1]");
    By _enternewemailaddress = By.id("EmailAddress");
    public void checkSetupPageIsOpenOrNot(){
        waitAndClick(_accountsetting,20);
        String acualassert = driver.findElement(By.xpath("//div[@class=\"content\"]/div/div[1]/h6")).getText();
        System.out.println(acualassert);
        assert_element(acualassert,"Time Zone  ","fail");
    }
    public void triggerReport(){
        waitForElementToBevisible(_triggerreports,20);
        click_Element(_triggerreports);
        waitForElementToBevisible(By.xpath("//form[@id=\"SaveTriggerReportRequest\"]//div[1]/h6"),20);
        String acualresulttrigger = driver.findElement(By.xpath("//form[@id=\"SaveTriggerReportRequest\"]//div[1]/h6")).getText();
        System.out.println(acualresulttrigger);
        assert_element(acualresulttrigger,"Report name","fail");
    }
    public void reportName(){ send_keys(_reportname, loadProp.getproperty("Reportname")); }
    public void reportType(){   click_Element(_realtimenotification);
    waitForElementToBeDisplay(_pagedata,20);
    waitAndClick(_pagedata,20);         }
    public  void recipients(){ click_Element(_receipients);waitForElementToBevisible(_newemailaddress,2000);click_Element(_newemailaddress);}
    public void enterNewEmailAddress(){ wait_UntilClickable(_enternewemailaddress);send_keys(_enternewemailaddress,"patelt"+timestampLong()+"leadforensics.com");}
}
