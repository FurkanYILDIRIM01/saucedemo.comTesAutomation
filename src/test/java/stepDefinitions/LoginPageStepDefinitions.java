package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at Home Page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("write {string} for username field")
    public void writeForUsernameField(String Username) {
        loginPage.writeUsernameField(Username);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("write {string} for password field")
    public void writeForPasswordField(String pass) {
        loginPage.writePasswordField(pass);
    }

    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String correctForUsername) {
        loginPage.correctUsername(correctForUsername);
    }


    @Then("Check {string} message about dont match")
    public void checkMessageAboutDontMatch(String dontMatch) {
        loginPage.dontMatchErrorMessage(dontMatch);
    }

    @When("write Correct {string} for password field")
    public void writeCorrectForPasswordField(String correctOfPassword) {
        loginPage.correctPassword(correctOfPassword);
    }

    @Then("Check Succesfull login")
    public void checkSuccesfullLogin() {
        loginPage.checkSuccesfullText();
    }
}
