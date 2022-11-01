package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextInputExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(TextInputExercisePage.class);

    @FindBy(id = "newButtonName")
    private WebElement inputForNewButtonName;

    @FindBy(id = "updatingButton")
    private WebElement buttonForNameChanging;

    private static final String  BUTTON_DEFAULT_NAME = "Button That Should Change it's Name Based on Input Value";

    public TextInputExercisePage(WebDriver driver) {
        super(driver);
    }

    public TextInputExercisePage enterNewNameForButton(String nameForButton) {
        waitForBeingClickable(10, inputForNewButtonName).sendKeys(nameForButton);
        logger.debug(nameForButton + " has been entered in input field");
        return this;
    }

    public TextInputExercisePage applyNewNameForButton() {
        waitForBeingClickable(10, buttonForNameChanging).click();
        logger.debug("button for name changing has been clicked");
        return this;
    }

    public String getButtonName() {
        new WebDriverWait(driver, Duration.ofSeconds(1)).until((ExpectedCondition<Boolean>) driver ->
                !buttonForNameChanging.getText().equals(BUTTON_DEFAULT_NAME));
        return buttonForNameChanging.getText();
    }
}
