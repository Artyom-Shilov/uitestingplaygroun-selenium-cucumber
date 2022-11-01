package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenLayersExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(HiddenLayersExercisePage.class);

    @FindBy(id = "blueButton")
    private WebElement blueButton;

    @FindBy(id = "greenButton")
    private WebElement greenButton;

    public HiddenLayersExercisePage(WebDriver driver) {
        super(driver);
    }

    public HiddenLayersExercisePage clickBlueButton() {
        waitForBeingClickable(10, blueButton).click();
        logger.debug("blue button has been clicked");
        return this;
    }

    public HiddenLayersExercisePage clickGreenButton() {
        waitForBeingClickable(10, greenButton).click();
        logger.debug("green button has been clicked");
        return this;
    }
}
