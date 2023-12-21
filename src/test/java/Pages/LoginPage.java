package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    Util.ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new Util.ElementHelper(driver);

    }

    By loginButton = By.id("login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernameBoxClick = By.id("user-name");

    By passwordBoxClick = By.cssSelector("#password");

    By productText = By.cssSelector(".title");



    public void userAtHomePage() {
        driver.get("https://www.saucedemo.com/");

    }

    public void clickLogin() {
      driver.findElement(loginButton);
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameField(String username) {
        driver.findElement(usernameBoxClick).click();
        elementHelper.sendKey(usernameBoxClick,"furkan123");

    }

    public void writePasswordField(String pass) {
        driver.findElement(passwordBoxClick).click();
        elementHelper.sendKey(passwordBoxClick,"pass123");


    }

    public void correctUsername(String correctForUsername) {
        driver.findElement(usernameBoxClick).click();
        elementHelper.sendKey(usernameBoxClick,"standard_user");
    }

    public void dontMatchErrorMessage(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void correctPassword(String correctOfPassword) {
        driver.findElement(passwordBoxClick).click();
        elementHelper.sendKey(passwordBoxClick,"secret_sauce");

    }

    public void checkSuccesfullText() {
        elementHelper.checkVisible(productText);
    }
}
