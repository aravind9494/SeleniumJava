import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Joseph Aravind");
        driver.findElement(By.id("date")).sendKeys("05/04/2020");
        Thread.sleep(5000);
        driver.findElement(By.id("date")).clear();
        Thread.sleep(5000);

        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
