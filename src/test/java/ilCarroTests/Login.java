package ilCarroTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
    @BeforeTest
    WebDriver wd;
    public void setUp(){
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
      //  wd.manage().
        wd.get("https://ilcarro.web.app/");
    }


    @Test
    public void positiveLoginTest(){
        wd.findElement(By.xpath("//a[text()=' Log in ']")).click();

        wd.findElement(By.xpath("(//input[@id='email'])")).click();
        wd.findElement(By.xpath("(//input[@id='email'])")).clear();
        wd.findElement(By.xpath("(//input[@id='email'])")).sendKeys("domes7@mail.com");

        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("123456Aa$");

        wd.findElement((By.xpath("//button[contains(text(),'Y’alla!')]"))).click();

        wd.findElement()

    }

    @AfterTest
    public void tearDown{

    }
}
