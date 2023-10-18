package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDownMenu {
    WebDriver wd = new ChromeDriver();
    Select select;
@Test
    public void DropDownMenuTest(){
//        wd = new ChromeDriver();
        wd.manage().window().maximize();
     //   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds());
        wd.get("https://the-internet.herokuapp.com/dropdown");
        WebElement ddown = wd.findElement(By.id("dropdown"));
        select = new Select(ddown);
        select.selectByValue("2");
    }
}
