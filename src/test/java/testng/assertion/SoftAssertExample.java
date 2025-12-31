package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        SoftAssert sf = new SoftAssert();
        sf.assertFalse(userName.isDisplayed(), "username textbox should be displayed");
        sf.assertTrue(password.isDisplayed(), "password textbox should be displayed");
        sf.assertEquals(loginBtn.getTagName(), "div", "login button tag name should be div");
		System.out.println("Hello All");
    }
}
