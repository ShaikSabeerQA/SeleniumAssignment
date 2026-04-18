package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import java.util.List;

public class WebTablePage {

    WebDriver driver;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Table element (for scrolling)
    @FindBy(xpath = "//table")
    WebElement table;

    @FindBy(xpath = "//table//tbody/tr")
    List<WebElement> rows;

    @FindBy(xpath = "//table//thead/tr/th")
    List<WebElement> columns;

    // Scroll to table (BEST PRACTICE)
    public void scrollToTable() {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", table);
    }

    public int getRowCount() {
        return rows.size();
    }

    public int getColumnCount() {
        return columns.size();
    }

    public List<WebElement> getRows() {
        return rows;
    }
}