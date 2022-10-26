package com.shilov.training.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static com.shilov.training.utills.Waiting.*;

public class VisibilityExercisePage extends BasePage {

    @FindBy(id = "hideButton")
    private WebElement hideButton;

    @FindBy(id = "transparentButton")
    private WebElement opacity0Button;

    @FindBy(id = "removedButton")
    private WebElement removedButton;

    @FindBy(id = "invisibleButton")
    private WebElement visibilityHiddenButton;

    @FindBy(id = "zeroWidthButton")
    private WebElement zeroWidthButton;

    @FindBy(id = "notdisplayedButton")
    private WebElement displayNoneButton;

    @FindBy(id = "overlappedButton")
    private WebElement overlappedButton;

    @FindBy(id = "offscreenButton")
    private WebElement offscreenButton;

    public VisibilityExercisePage(WebDriver driver) {
        super(driver);
    }

    public VisibilityExercisePage clickHideButton() {
        waitForBeingClickable(driver, 10, hideButton).click();
        return this;
    }

    public Map<String, Boolean> getDisplayStatusesOfButtons() {
        return Map.ofEntries(
                Map.entry("opacity0Button", opacity0Button.isDisplayed()),
                Map.entry("removedButton", getVisibilityOfRemovedButton()),
                Map.entry("visibilityHiddenButton", visibilityHiddenButton.isDisplayed()),
                Map.entry("zeroWidthButton", zeroWidthButton.isDisplayed()),
                Map.entry("displayNoneButton", displayNoneButton.isDisplayed()),
                Map.entry("overlappedButton", overlappedButton.isDisplayed()),
                Map.entry("offscreenButton", offscreenButton.isDisplayed())
        );
    }

    private boolean getVisibilityOfRemovedButton() {
        try {
            return removedButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
