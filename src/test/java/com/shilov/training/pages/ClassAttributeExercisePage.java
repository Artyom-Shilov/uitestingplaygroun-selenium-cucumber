package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClassAttributeExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(ClassAttributeExercisePage.class);

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    private WebElement blueButton;

    public ClassAttributeExercisePage(WebDriver driver) {
        super(driver);
    }

    public ClassAttributeExercisePage clickBlueButton() {
        waitForBeingClickable(10, blueButton).click();
        logger.debug("blue button has been clicked");
        return this;
    }

    public String getTextFromAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        logger.debug("alert has been appeared");
        return driver.switchTo().alert().getText();
    }

    public ClassAttributeExercisePage handleAlert() {
        driver.switchTo().alert().accept();
        logger.debug("alert has been accepted");
        return this;
    }
}
