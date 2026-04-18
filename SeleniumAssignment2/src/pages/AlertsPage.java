package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AlertsPage {

    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement jsAlertBtn;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement jsConfirmBtn;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement jsPromptBtn;

    @FindBy(id = "result")
    WebElement resultText;

    // Actions
    public void clickJsAlert() {
        jsAlertBtn.click();
    }

    public void clickJsConfirm() {
        jsConfirmBtn.click();
    }

    public void clickJsPrompt() {
        jsPromptBtn.click();
    }

    public String getResultText() {
        return resultText.getText();
    }

    // Alert actions
    public Alert switchToAlert() {
        return driver.switchTo().alert();
    }
}