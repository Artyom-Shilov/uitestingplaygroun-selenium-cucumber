package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickExercisePage extends BasePage {

    @FindBy(id = "badButton")
    private WebElement buttonIgnoringDomClickEvent;

    public ClickExercisePage(WebDriver driver) {
        super(driver);
    }

    public ClickExercisePage clickButtonIgnoringDomClickEvent() {
        Waiting.waitForBeingClickable(driver, 10, buttonIgnoringDomClickEvent).click();
        return this;
    }

    public boolean checkButtonColorChange(String expectedHexColor) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(2)).until((ExpectedCondition<Boolean>) driver ->
                    Color.fromString(buttonIgnoringDomClickEvent.getCssValue("background-color")).asHex()
                            .equals(expectedHexColor));
        } catch (TimeoutException e) {
            return false;
        } return true;
    }
}
