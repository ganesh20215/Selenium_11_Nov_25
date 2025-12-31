package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {

    //1. Open application
    //2. open child window
    //3. click on blog option
    //4. fetch the title of blog page
    //5. close blog window
    //6. click on radio button
    //7. close the parent window

    public static void main(String[] args) throws InterruptedException {
        //Open application
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        //open child window
        driver.findElement(By.id("openwindow")).click();

        String parentId = driver.getWindowHandle();
        //System.out.println(parentId);

        Set<String> allWindows = driver.getWindowHandles();
        //System.out.println(allWindows);

        for (String s : allWindows) {
            if (!s.contentEquals(parentId)) {
                driver.switchTo().window(s);
                driver.findElement(By.linkText("BLOG")).click();
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(parentId);
        Thread.sleep(2000);
        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
