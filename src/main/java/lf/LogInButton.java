package lf;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogInButton extends Utils
{

    HomePage hm = new HomePage();
    LoadProp loadProp = new LoadProp();
    By _username = By.id("UserName");
    By _password= By.id("Password");
    By _loginbuttonfinal = By.id("btnSubmit");
    By _logout = By.linkText("LOGOUT");
    public void userDetail() {
        waitForElementToBevisible(_username,20);
        wait_UntilClickable(_username);
        send_keys(_username, loadProp.getproperty("UserName"));
        waitForElementToBevisible(_password,20);
        wait_UntilClickable(_password);
        send_keys(_password, loadProp.getproperty("Password"));
        waitForElementToBeDisplay(_loginbuttonfinal,2000);
        click_Element(_loginbuttonfinal);
        waitForElementToBevisible(By.id("portal-name"),20);
        String actualRegisterSuccessMessage = driver.findElement(By.id("portal-name")).getText();
        System.out.println(actualRegisterSuccessMessage);
       assert_element(actualRegisterSuccessMessage,"lfoptimise","Test case failed");
    }

    public void userLogOut(){
        waitForElementToBevisible(_logout,20);
        click_Element(_logout); }

    public void verifyUserLogout(){
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(driver.getCurrentUrl().contains(url), "Test case fail");


    }


}
