import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class OpenBroswerTest {
    @Test
    public void test(){
//        WebDriver driver = new FirefoxDriver();
//        System.setProperty("webdriver.firefox.bin",".\\resouce\\MicrosoftWebDriver.exe");
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",".\\resouce\\chromedriver.exe");
//        WebDriver driver = new InternetExplorerDriver();
//        System.setProperty("webdriver.ie.driver",".\\resouce\\IEDriverServer.exe");
        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
        //设置窗口尺寸
        Dimension dimension = new Dimension(400,500);
        driver.manage().window().setSize(dimension);
        driver.findElement(By.id("kw")).sendKeys("111");
        try {
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(2000);
          String currentUrl =  driver.getCurrentUrl();
            Assert.assertEquals(currentUrl,"https://www.baidu.com/");//第一个参数是实际值，第二个参数是期望值
            String tile = driver.getTitle();
            System.out.println("currentUrl:"+currentUrl+" ,tile:"+tile);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
