package lf;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import java.io.File;

public class Hooks extends BasePage  {
  AllBrowser allbrowser = new AllBrowser();

    @Before
    public void setUp() {
     chrome_Driver();
    }


@After

 public void afterMethod(){       driver.quit(); }
//  public void after(ITestResult result)
//    {
//        if (ITestResult.FAILURE == result.getStatus())
//        {
//            try
//            {
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                File source = ts.getScreenshotAs(OutputType.FILE);
//                FileUtils.cop(source, new File("src\\test\\Resources\\Screenshot" + result.getName() + ".png"));
//                System.out.println("Screenshot taken");
//            }
//            catch (Exception e)
//            {
//                System.out.println("exception while taking Screenshot " + e.getMessage());
//            }

        }








