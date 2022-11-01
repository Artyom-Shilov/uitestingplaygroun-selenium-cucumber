package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(SampleAppExercisePage.class);

    @FindBy(id = "loginstatus")
    private WebElement loginStatusLabel;

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(id = "login")
    private WebElement logoutButton;

    @FindBy(name = "UserName")
    private WebElement userNameInput;

    @FindBy(name = "Password")
    private WebElement passwordInput;

    public SampleAppExercisePage(WebDriver driver) {
        super(driver);
    }

    public SampleAppExercisePage enterLogin(String login) {
        waitForBeingClickable(10, userNameInput).sendKeys(login);
        logger.debug("login has been entered in login field");
        return this;
    }

    public SampleAppExercisePage enterPassword(String password) {
        waitForBeingClickable(10, passwordInput).sendKeys(password);
        logger.debug("password has been entered in password field");
        return this;
    }

    public SampleAppExercisePage clickLoginButton() {
        waitForBeingClickable(10, loginButton).click();
        logger.debug("login button has been clicked");
        return this;
    }

    public SampleAppExercisePage clickLogoutButton() {
        waitForBeingClickable(10, logoutButton).click();
        logger.debug("logout button has been clicked");
        return this;
    }

    public String getLoginStatus() {
        return waitForBeingClickable(10, loginStatusLabel).getText();

    }
}
