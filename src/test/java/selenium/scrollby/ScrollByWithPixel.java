package selenium.scrollby;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByWithPixel {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        //scroll down by pixel
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2500)");

        //scroll up by pixel
        Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0, -2500)");


        driver.findElement(By.xpath("//a[text()='Disclaimer']")).click();
    }
}
