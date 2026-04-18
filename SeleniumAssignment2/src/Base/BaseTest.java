package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public void setup() {

        
        driver = new ChromeDriver();

        // Maximize
        driver.manage().window().maximize();

        // Implicit wait (basic sync)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ✅ URL from config file (IMPORTANT)
        driver.get(ConfigReader.get("url"));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}