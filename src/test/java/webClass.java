import com.sun.javafx.geom.Edge;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webClass {
    public static void main(String[] args) {
        WebDriver wd;
        String browser = "Edge";
//        @BeforeTest
//        @AfterTest
        @Test
        public void searchWebDriverTest(String browser){
            if(browser.equals("Edge")){

                WebDriverManager.edgedriver().setup();
                wd = new EdgeDriver();
            }

            wd.manage().window().maximize();
            wd.navigate().to("https://www.google.com/");

            wd.findElement(By.name("q"));

        }
    }

}
