package GooglePage;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com.vn/?hl=vi");
        Thread.sleep(2000);
        String t = "demo cypress testing";

        driver.findElement(By.xpath("//input[@title='Tìm kiếm']")).sendKeys(t);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@title='Tìm kiếm']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        List<WebElement> l1 = driver.findElements(By.xpath("//span[contains(text(),'demo cypress testing')]"));
        List<WebElement> l2 = driver.findElements(By.xpath("//h3[contains(text(),'demo cypress testing')]"));


        if (l1.size() > 0 || l2.size() > 0) {
            System.out.println("Test is passed : " + t + " is present. ");
        } else {
            System.out.println("Test is failed : " + t + " is not present. ");
        }


        //Kết thúc
        Thread.sleep(2000);
        driver.quit();

    }
}
