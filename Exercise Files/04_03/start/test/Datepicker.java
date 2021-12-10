import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("09/09/1997");
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("document.getElementById('datepicker').value='09/09/1997'");
        Thread.sleep(5000);
        datepicker.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();
    }
}