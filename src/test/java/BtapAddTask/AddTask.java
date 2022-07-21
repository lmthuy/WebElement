package BtapAddTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AddTask {
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

        //Add Task
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
        Thread.sleep(2000);

        //Tiêu đề
        driver.findElement(By.xpath("//input[@placeholder='Tiêu đề']")).sendKeys("Task 1");
        Thread.sleep(2000);
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
        //Giờ ước tính
        driver.findElement(By.xpath("//input[@placeholder='Giờ ước tính']")).sendKeys("50");
        Thread.sleep(2500);

        //Dự án
        driver.findElement(By.xpath("//label[contains(text(),'Dự án')]/following-sibling::span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(.,'Bai Tap 1')]")).click();
        Thread.sleep(2000);

        //Tóm tắt
        driver.findElement(By.xpath("//textarea[@id='summary']")).sendKeys("The parts of a project summary will vary depending on the type of project.");
        Thread.sleep(2000);

        //Mô tả
        driver.switchTo().frame(0);
        WebElement m = driver.findElement(By.xpath("//body"));
        m.sendKeys("Objectives: Set specific and measurable project goals");
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
