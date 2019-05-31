import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class OperationsChrome {
    private WebDriver driver;

    public OperationsChrome(WebDriver driver){
        this.driver = driver;
    }

    public void openUrl(String url){
        driver.navigate().to(url);
    }

    public void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public void setValue(String xpath, String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);

    }
    public void screenshot(){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
