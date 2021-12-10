import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openModelButton = driver.findElement(By.id("modal-button"));
        openModelButton.click();
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();",closeButton);
        closeButton.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
