package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInterfaceExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot password?")).click();

        //Thread.sleep(2000);
        driver.navigate().back();

        //Thread.sleep(2000);
        driver.navigate().forward();

        //Thread.sleep(3000);
        driver.navigate().refresh();

        System.out.println(driver.getCurrentUrl());
    }
}
