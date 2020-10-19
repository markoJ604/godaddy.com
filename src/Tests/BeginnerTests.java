package Tests;

import Constants.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class BeginnerTests {

    public static WebDriver driver;
    public static SoftAssert sa;

    @BeforeMethod

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver-2");
        driver = new ChromeDriver();
        sa = new SoftAssert();
    }

    @Test

    //Launch browser and Open Godaddy.com/Open Godaddy.com and maximize browser window
    public void TestCase1() {
        driver.get(Paths.domainURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.close();
    }

    @Test

    //Open Godaddy.com and Print it's Page title.
    public void TestCase3(){
        driver.get(Paths.domainURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }

    @Test

    //Open Godaddy.com and Print current url.
    public void TestCase4() {
        driver.get(Paths.domainURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
    }

    @Test

    //Open Godaddy.com and Print Page source.
    public void TestCase5() {
        driver.get(Paths.domainURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }

    @Test

    //Open Godaddy.com and Validate Page Title
    public void TestCase6(){
        driver.get(Paths.domainURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        sa.assertEquals(driver.getCurrentUrl(),Paths.expectedURL);
        sa.assertEquals(driver.getTitle(),Paths.pageTitle);
        sa.assertTrue(driver.getPageSource().contains("GoDaddy UK"));
        sa.assertAll();
        driver.close();
    }
}
