package com.shilov.training.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickExercisePage extends BasePage {

    private final Logger logger = LogManager.getLogger(ClickExercisePage.class);

    @FindBy(id = "badButton")
    private WebElement buttonIgnoringDomClickEvent;

    public ClickExercisePage(WebDriver driver) {
        super(driver);
    }

    public ClickExercisePage clickButtonIgnoringDomClickEvent() {
        waitForBeingClickable(10, buttonIgnoringDomClickEvent);
        new Actions(driver).moveToElement(buttonIgnoringDomClickEvent).click().build().perform();
        logger.debug("button that ignores Dom click event has been clicked");
        return this;
    }

    public boolean checkButtonColorChange(String expectedHexColor) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(2)).until((ExpectedCondition<Boolean>) driver ->
                    Color.fromString(buttonIgnoringDomClickEvent.getCssValue("background-color")).asHex()
                    .equals(expectedHexColor));
            logger.debug("color of button that ignores Dom click event changed to " + expectedHexColor);
        } catch (TimeoutException e) {
            return false;
        } return true;
    }
}
