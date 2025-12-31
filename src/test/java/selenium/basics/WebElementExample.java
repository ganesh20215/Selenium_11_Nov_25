package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //sendKeys()
        //WebElement userNameTextBox = driver.findElement(By.id("login1"));
        //userNameTextBox.sendKeys("Ganesh");

        //clear()
        //Thread.sleep(3000);
        //userNameTextBox.clear();

        //click()
        //driver.findElement(By.linkText("Forgot password?")).click();

        //getText()
        //WebElement e2 = driver.findElement(By.linkText("Forgot password?"));
        //System.out.println(e2.getText());

        //getTagName()
        WebElement e2 = driver.findElement(By.linkText("Forgot password?"));
        System.out.println(e2.getTagName());
    }
}
