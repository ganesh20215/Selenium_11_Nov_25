package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement dp = driver.findElement(By.id("multiple-select-example"));

        Select s = new Select(dp);

        //select by Index
        s.selectByIndex(2);
        Thread.sleep(2000);

        //select by value
        //s.selectByValue("orange");
        Thread.sleep(2000);

        //select by visible text
        s.selectByVisibleText("Apple");
        Thread.sleep(2000);

/*        //deselect by Index
        s.deselectByIndex(2);
        Thread.sleep(2000);

        //deselect by value
        s.deselectByValue("orange");
        Thread.sleep(2000);

        //deselect by visible text
        s.deselectByVisibleText("Apple");
        Thread.sleep(2000);*/

        //s.deselectAll();
        List<WebElement> allElements =  s.getAllSelectedOptions();
        for (WebElement e : allElements) {
            System.out.println(e.getText());
        }
    }
}
