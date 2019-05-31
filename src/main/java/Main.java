import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String pathToChromeDriver = "lib/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        WebDriver driver = new ChromeDriver();

        OperationsChrome operations = new OperationsChrome(driver);
        operations.openUrl("https://www.netcracker.com");
        operations.click(".//a[parent::li[@class = \"insights first\"]]");
        operations.setValue(".//input[@name= \"ntc-site-search\" and ancestor::div[@class= \"navbar-sub\"]]", "faq");
        operations.click(".//span[@class=\"search-icon\" and ancestor::div[@class= \"navbar-sub\"]]");
        operations.screenshot();
        try{
            Thread.sleep(5000);
        }catch( InterruptedException e ){
        }
        driver.close();
    }
}
