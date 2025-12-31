package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com");

        //Add our Own cookie
        Cookie ac = new Cookie("Company", "Edso Services");
        driver.manage().addCookie(ac);

        //Fetch all cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }

        System.out.println("------------");
        System.out.println();

        //get cookie by name
        //System.out.println(driver.manage().getCookieNamed("Company"));

        //driver.manage().deleteCookieNamed("Company");
        driver.manage().deleteAllCookies();

        //Fetch all cookies after deletion
        Set<Cookie> dc = driver.manage().getCookies();
        for (Cookie c : dc){
            System.out.println(c);
        }

        driver.close();
    }
}
