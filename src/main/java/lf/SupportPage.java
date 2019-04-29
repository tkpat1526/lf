package lf;

import org.openqa.selenium.By;

public class SupportPage extends Utils {
    By _raiseaticket = By.xpath("//ul[@class=\"k-group k-menu-group k-popup k-reset k-state-border-up\"]/li[1]");


    public void checkSupportPageIsOpenOrNot(){
        waitForElementToBevisible(_raiseaticket,20);
        click_Element(_raiseaticket);
        String actualmessge = driver.findElement(By.xpath("//div[@style=\"float: left; width: 500px;\"]/h2")).getText();
        System.out.println(actualmessge);
        assert_element(actualmessge,"Hi A, how can we help you?","fail");
    }


}
