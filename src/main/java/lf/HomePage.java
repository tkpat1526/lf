package lf;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils {

    By _clickdashboard = By.linkText("Dashboard");
    By _clickvisitorlist = By.linkText("Visitor List");
    By _clickleads = By.linkText("Leads");
    By _clickmessenger = By.linkText("Messenger");
    By _clicksearch = By.linkText("Search");
    By _clicksupport = By.linkText("Support");
    By _clickacademy = By.linkText("Academy");
    By _clickaccelerate = By.linkText("Accelerate");
    By _clicklogin = By.linkText("Log in");
    By _clickreports = By.linkText("Reports");
    By _categories = By.xpath("//ul[@class=\"k-group k-menu-group k-popup k-reset k-state-border-up\"]/li[1]");
    By _setuppage = By.xpath("//div[@class=\"main-menu right\"]/ul/li[7]");
    By _reportpage = By.xpath("//div[@class=\"main-menu right\"]/ul/li[3]");
    By _support = By.xpath("//div[@class=\"main-menu right\"]/ul/li[8]");



    public void clickOnLogIn() { click_Element(_clicklogin); }
    public void dashboardPage() { click_Element(_clickdashboard); }
    public void visitorlist() { click_Element(_clickvisitorlist); }
    public void leadsPage() { click_Element(_clickleads); }
    public void messengerPage() { click_Element(_clickmessenger); }
    public void searchPage() { click_Element(_clicksearch); }
    public void academyPage() { click_Element(_clickacademy); }
    public void acceleratePage() { click_Element(_clickaccelerate); }
    public void reportspage() { click_Element(_clickreports);click_Element(_categories); }
    public void setupPage(){
        mouseHover(_setuppage);
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(By.xpath("//div[@class=\"main-menu right\"]/ul/li[7]"));
//        action.moveToElement(we).click().build().perform();
    }
    public void reportsPage(){ mouseHover(_reportpage); }
    public void supportpage(){mouseHover(_support);}

}


