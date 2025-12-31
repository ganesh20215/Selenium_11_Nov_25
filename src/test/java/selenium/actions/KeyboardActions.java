package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement textBox = driver.findElement(By.name("q"));

        Actions a = new Actions(driver);

        a.moveToElement(textBox)
                .click(textBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("t shirt for men")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

    }
}
