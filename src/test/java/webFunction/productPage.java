package webFunction;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.baseClass;
import org.openqa.selenium.WebDriver;

public class productPage extends baseClass {
    WebDriver webDriver;
    public productPage(WebDriver remoteDriver) {
        webDriver = remoteDriver;
    }
    public void porduct() throws InterruptedException{

        webDriver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//a[normalize-space()='CHECKOUT']")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Demo");
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("User");
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("392001");
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//a[normalize-space()='FINISH']")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
        Thread.sleep(500);



    }
}


