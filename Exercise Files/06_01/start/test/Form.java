import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Joseph Aravind");
        driver.findElement(By.id("last-name")).sendKeys("Muvva");
        driver.findElement(By.id("job-title")).sendKeys("Associate Applications Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        Select experience = new Select(driver.findElement(By.id("select-menu")));
        experience.selectByVisibleText("0-1");
        driver.findElement(By.id("datepicker")).sendKeys("02/12/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//*[text()='Submit' and @role='button']")).click();
        //Thread.sleep(10000);
        Form f = new Form();
        boolean isSuccessful = f.elementFoundOrNot(driver, "//div[contains(text(),'The form was successfully submitted!')]");
        assertEquals()
        driver.quit();

    }

    public boolean elementFoundOrNot(WebDriver driver, String xpath){
        try {
            driver.findElement(By.xpath(xpath));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
