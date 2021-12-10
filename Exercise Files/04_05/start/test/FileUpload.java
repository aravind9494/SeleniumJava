import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/mujoseph/Automation_QA/BrowserDrivers_64bit_Mac/chromedriver");

        WebDriver driver = new ChromeDriver();

//        driver.get("https://formy-project.herokuapp.com/fileupload");
//
//        WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
//        fileUpload.sendKeys("file-to-upload.png");

        driver.get("http://demo.guru99.com/test/upload/");
        Thread.sleep(15000);
        WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
        fileUpload.sendKeys("\\Users\\mujoseph\\Downloads\\155102.pdf");
        WebElement submit = driver.findElement(By.id("submitbutton"));
        driver.findElement(By.id("terms")).click();
        submit.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
