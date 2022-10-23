package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadDelayExercisePage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'btn btn-primary')]")
    private WebElement buttonAppearingAfterDelay;

    public LoadDelayExercisePage(WebDriver driver) {
        super(driver);
    }

    public LoadDelayExercisePage clickButtonAppearingAfterDelay() {
        Waiting.waitForBeingClickable(driver, 10, buttonAppearingAfterDelay).click();
        return this;
    }
}
