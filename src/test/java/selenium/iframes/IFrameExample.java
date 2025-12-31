package selenium.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;


public class IFrameExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        //Automation way to identify iframe
  /*      List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());*/

        //name or id
        //driver.switchTo().frame("frame1");

        //webelement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement e1 = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(e1.getText());

        driver.switchTo().parentFrame();

        WebElement frameText = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(frameText.getText());

    }
}
