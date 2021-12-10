import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement nameInput = driver.findElement(By.xpath("//*[@id='name']"));
        nameInput.sendKeys("Hii");

        WebElement button = driver.findElement(By.xpath("//*[@id='button']"));
        button.click();

        Thread.sleep(30000);
        driver.quit();
    }
}
