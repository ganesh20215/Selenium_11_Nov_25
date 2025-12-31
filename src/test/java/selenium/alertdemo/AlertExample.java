package selenium.alertdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        //driver.findElement(By.id("name")).sendKeys("Riddhi Mittal");

        driver.findElement(By.id("confirmbtn")).click();

        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.dismiss();

        driver.findElement(By.id("bmwcheck")).click();

    }
}
