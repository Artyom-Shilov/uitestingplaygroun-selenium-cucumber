package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadDelayExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(LoadDelayExercisePage.class);

    @FindBy(xpath = "//*[contains(@class, 'btn btn-primary')]")
    private WebElement buttonAppearingAfterDelay;

    public LoadDelayExercisePage(WebDriver driver) {
        super(driver);
    }

    public LoadDelayExercisePage clickButtonAppearingAfterDelay() {
        waitForBeingClickable(10, buttonAppearingAfterDelay).click();
        logger.debug("button appearing after delay has been clicked");
        return this;
    }
}
