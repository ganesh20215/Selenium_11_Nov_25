package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGExample {
/*    public static WebDriver driver;

    @BeforeMethod
    public void b1(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void b2(){
        driver.close();
    }*/

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.close();
    }

    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.peoplenexusai.com/");
        driver.close();
    }

    @Test
    public void test3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in");
        driver.close();
    }

    @Test
    public void test4(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.close();
    }

    @Test
    public void test5(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.close();
    }
}
