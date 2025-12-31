package selenium.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("D:\\classes\\Edso\\AutomationTesting\\Selenium\\SeleniumWebDriver.pptx");

        driver.findElement(By.id("file-submit")).click();

        WebElement uploadedMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        System.out.println(uploadedMessage.isDisplayed());
    }
}
