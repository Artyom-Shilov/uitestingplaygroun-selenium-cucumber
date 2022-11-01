package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(DynamicIdExercisePage.class);

    @FindBy(xpath = "//button[@type = 'button' and @class = 'btn btn-primary']")
    private WebElement buttonWithDynamicId;

    public DynamicIdExercisePage(WebDriver driver) {
        super(driver);
    }

    public DynamicIdExercisePage clickButtonWithDynamicId() {
        waitForBeingClickable(10, buttonWithDynamicId).click();
        logger.debug("button with dynamic id has been clicked");
        return this;
    }
}
