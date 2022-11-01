package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientSideDelayExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(ClientSideDelayExercisePage.class);

    @FindBy(id = "ajaxButton")
    private WebElement triggerButton;

    @FindBy(xpath = "//div[@id = 'content']/p")
    private WebElement calculatedDataElement;

    public ClientSideDelayExercisePage(WebDriver driver) {
        super(driver);
    }

    public ClientSideDelayExercisePage clickTriggerButton() {
        waitForBeingClickable(10, triggerButton).click();
        logger.debug("trigger button has been clicked");
        return this;
    }

    public String getCalculatedDataText() {
        return waitForBeingClickable(16, calculatedDataElement).getText();
    }


}
