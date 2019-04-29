package lf;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReportsPage extends Utils{
    By _categories = By.xpath("//ul[@class=\"k-group k-menu-group k-popup k-reset k-state-border-up\"]/li[1]");


    public void checkReportsPageIsOpenOrNot(){
        waitForElementToBevisible(_categories,20);
        click_Element(_categories);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(driver.getCurrentUrl().contains(url), "Test case fail");
    }
}
