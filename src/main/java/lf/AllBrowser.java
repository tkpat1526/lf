package lf;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowser  extends BasePage{

    LoadProp loadprop = new LoadProp();
    String browser = loadprop.getproperty("Browser");

    //creating method for multi browser
    public void selectBrowser(){

        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src\\test\\Resources\\Browser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\Browser\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else{System.out.print("Wrong Browser");
        }
    }


}


