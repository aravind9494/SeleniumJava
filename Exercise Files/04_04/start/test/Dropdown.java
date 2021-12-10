import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownButton.click();

        List<WebElement> dropdownItems = driver.findElements(By.xpath("//a[contains(@class,'dropdown-item')]"));
        for(WebElement item:dropdownItems){
            if(item.getText().equals("Buttons")){
                item.click();
                break;
            }
        }

        Thread.sleep(5000);

        driver.quit();
    }
}
