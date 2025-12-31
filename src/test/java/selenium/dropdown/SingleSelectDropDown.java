package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement dp = driver.findElement(By.id("carselect"));

        Select s = new Select(dp);

        //select by Index
        s.selectByIndex(2);
        Thread.sleep(2000);

        //select by value
        s.selectByValue("benz");
        Thread.sleep(2000);

        //select by visible text
        s.selectByVisibleText("BMW");
        Thread.sleep(2000);
    }
}
