package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Customer service')]")
    WebElement customerService;

    @FindBy(linkText = "Blog")
    WebElement blogLink;

    public void scrollToCustomerService() {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", customerService);
    }

    public void clickBlog() {
        blogLink.click();
    }
}