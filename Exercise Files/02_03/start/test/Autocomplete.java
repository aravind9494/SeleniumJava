import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://formy-project.herokuapp.com/dropdown");
        String pageLoadCompleted = (String) js.executeScript("return document.readyState");
        System.out.println(pageLoadCompleted);
        driver.findElement(By.id("dropdownMenuButton")).click();
        List<WebElement> lista = driver.findElements(By.className("dropdown-item"));
        for (int i=0;i<lista.size();i++) {
            //System.out.println(lista.get(i).getText());
            if(lista.get(i).getText().equals("Buttons")){
                lista.get(i).click();
                break;
            }
        }
        driver.switchTo().alert();
        Thread.sleep(10000);
        driver.quit();
    }
}
