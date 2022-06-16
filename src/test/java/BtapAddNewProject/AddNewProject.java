package BtapAddNewProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewProject {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Maximize browser
        driver.manage().window().maximize();
        //Đi đến url
        driver.navigate().to("https://hrm.anhtester.com");
        Thread.sleep(2000);
        //Đăng nhập
        driver.findElement(By.xpath("//div//input[@id='iusername']")).sendKeys("admin01");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id='ipassword'])[1]")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        //Add New Project
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
        Thread.sleep(2000);

        //Tiêu đề
        driver.findElement(By.xpath("//input[@placeholder='Tiêu đề']")).sendKeys("Bai Tap 1");
        Thread.sleep(1000);

        //Khách hàng
        driver.findElement(By.xpath("//span[@id='select2-client_id-container']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@id='select2-client_id-results']//li[contains(.,'Lam Nguyen')]")).click();
        Thread.sleep(2000);

        //Giờ ước tính
        driver.findElement(By.xpath("(//input[@placeholder='Giờ ước tính'])[1]")).sendKeys("40");
        Thread.sleep(1000);

        //Priority
        driver.findElement(By.xpath("//label[normalize-space()='Priority']/following-sibling::span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='select2-results']//li[contains(.,'Cao nhất')]")).click();
        Thread.sleep(1000);

        //Ngày bắt đầu
        driver.findElement(By.xpath("//label[contains(text(),'Ngày bắt đầu')]/following-sibling::div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='22']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='OK'])[1]")).click();

        //Ngày kết thúc
        driver.findElement(By.xpath("//label[contains(text(),'Ngày kết thúc')]/following-sibling::div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/a[1]")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='OK'])[2]")).click();
        Thread.sleep(1000);

        //Tóm tắt
        driver.findElement(By.xpath("(//textarea[@id='summary'])[1]")).sendKeys("The parts of a project summary will vary depending on the type of project.");
        Thread.sleep(2000);

        //Nhóm
        driver.findElement(By.xpath("//label[contains(normalize-space(),'Nhóm')]/following-sibling::span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(.,'Admin 01')]")).click();
        Thread.sleep(1000);

        //Mô tả
        driver.switchTo().frame(0);
        WebElement m = driver.findElement(By.xpath("//body"));
        m.sendKeys("A strong project description provides a roadmap for stakeholders and communicates the vision without getting bogged down in details");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        //Lưu
        driver.findElement(By.xpath("//div[@class='card-footer text-right']//button[@type='submit']")).click();
        Thread.sleep(2000);
        //Kết thúc
        Thread.sleep(2000);
        driver.quit();

    }
}
