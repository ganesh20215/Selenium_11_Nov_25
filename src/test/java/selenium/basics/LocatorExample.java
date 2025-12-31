package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        //Id locator Example
        //driver.findElement(By.id("login1")).sendKeys("Ganesh Jadhav");

        //classname locator Example
        //driver.findElement(By.className("email-input")).sendKeys("Ganesh Jadhav");

        //name locator Example
        //driver.findElement(By.name("login")).sendKeys("Ganesh Jadhav");

        //linktext locator example
        //driver.findElement(By.linkText("Forgot password?")).click();

        //partialLinkText locator example
        //driver.findElement(By.partialLinkText("password?")).click();

        //tagname locator example
        //List<WebElement> allElements =driver.findElements(By.tagName("input"));
        //System.out.println(allElements.size());

        //csselector locator
        //driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Ganesh");
        //driver.findElement(By.cssSelector("input.email-input")).sendKeys("Ganesh");

        //xpath
        //absolute xpath
        //driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[1]/div/input")).sendKeys("Ganesh");

        //Relative xpath
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ganesh");

        //Text() function in xpath
        //driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();

        //And() OR() method
        //driver.findElement(By.xpath("//input[@id='password' and @name='passwd']")).sendKeys("Test Method");
        //driver.findElement(By.xpath("//input[@id='password'or @name='pass']")).sendKeys("Test Method");

        //starts-with() method
        //driver.findElement(By.xpath("//a[starts-with(text(),'Get a new')]")).click();

        //contains() method
        //driver.findElement(By.xpath("//a[contains(text(),'Rediffmail ID')]")).click();

        //following xpath axes
        Thread.sleep(3000);
        Actions a = new Actions(driver);
        WebElement e1 = driver.findElement(By.xpath("//span[text()='Login']"));
        a.moveToElement(e1).perform();

        Thread.sleep(3000);
        List<WebElement> allElements = driver.findElements(By.xpath("//span[text()='Login']//following::a/li"));
        for (WebElement e : allElements){
            if (e.getText().equalsIgnoreCase("Rewards")){
                e.click();
                break;
            }
        }
    }
}
