import Constants.Paths;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver-2");
        WebDriver driver = new ChromeDriver();
        driver.get(Paths.domainURL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}
