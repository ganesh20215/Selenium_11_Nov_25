package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class FindElementsExample {

    public static void main(String[] args) {
        //1. locate for multiple webelement
        //2. return type is List<WebElement>
        //3. return zero webelement and findElements method not throwing any exceptions to you

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        List<WebElement> allElements =driver.findElements(By.tagName("in"));
        System.out.println(allElements.size());

        for (WebElement e : allElements){
            System.out.println(e);
        }

        driver.close();
    }
}
