package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class BlogPage {

    WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".block-blog-archive .title strong")
    WebElement blogArchive;

    public String getBlogArchiveText() {
        return blogArchive.getText();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}