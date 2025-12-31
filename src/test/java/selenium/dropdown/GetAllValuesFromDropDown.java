package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllValuesFromDropDown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement dp = driver.findElement(By.id("carselect"));

        Select s = new Select(dp);

        List<WebElement> allElements = s.getOptions();
        for (WebElement e : allElements) {
            System.out.println(e.getText());
        }

        driver.close();
    }
}
