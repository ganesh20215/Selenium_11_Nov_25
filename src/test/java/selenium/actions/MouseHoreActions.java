package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoreActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement elementA = driver.findElement(By.xpath("//span[text()='Fashion']"));

        Actions a = new Actions(driver);

        a.moveToElement(elementA).perform();
    }
}
