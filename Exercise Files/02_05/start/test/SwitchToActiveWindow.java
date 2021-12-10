import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newWindowButton = driver.findElement(By.id("new-tab-button"));
        newWindowButton.click();
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        System.out.println(driver.getTitle());
        //System.out.println(allWindows.get(2));
        for(String handle:driver.getWindowHandles()) {
            System.out.println(handle);
            driver.switchTo().window(handle);
        }
        System.out.println(driver.getTitle());
        WebElement components = driver.findElement(By.id("navbarDropdownMenuLink"));
        components.click();
        driver.switchTo().window(originalWindow);
        Thread.sleep(10000);
        driver.quit();
    }
}
