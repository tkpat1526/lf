package lf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dashboard extends  Utils {

    By _clicksetup = By.xpath("//i[@class=\"fa fa-cogs fa-2x\"]");
    By _clciklaout5 = By.id("layout_2");
    By _savebutton = By.id("btn-save-dashboard");


    public void setup () {
        click_Element(_clicksetup);
        click_Element(_clciklaout5);
    }
    public void changeLayout(){
        WebElement sourceLocator = driver.findElement(By.xpath("//div[@id=\"widgetSelection\"]/div/div[1]/div/div[1]/div[2]/ol/li[1]"));
//To get target locator
        WebElement targetLocator = driver.findElement(By.xpath("//div[@id=\"zone1\"]/div[2]"));
//create object 'action' of Actions class
        Actions action = new Actions(driver);
//use dragAndDrop() method. It accepts two parameter source and target.
        action.dragAndDrop(sourceLocator, targetLocator).build().perform();
        String actualRegisterSuccessMessage = driver.findElement(By.xpath("//div[@id=\"widgetPanel_5f93179b0d0143f6999c610576cac941\"]/div[3]/div[1]/span")).getText();
        System.out.println(actualRegisterSuccessMessage);
        assert_element("All Time",actualRegisterSuccessMessage,"test fail");
    }
    public void saveSetupButton(){
        click_Element(_savebutton);
    }
}

