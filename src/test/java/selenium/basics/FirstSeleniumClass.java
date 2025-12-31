package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {

        //WebDriver : Interface
        //driver : Object
        //new : keyword to initialized an object
        //ChromeDriver = class

        WebDriver driver = new ChromeDriver();   //upcasting
        //ChromeDriver driver = new ChromeDriver();


        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();
        driver.get("https://www.edso.in");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
