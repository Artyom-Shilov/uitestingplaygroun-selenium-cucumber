package com.shilov.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.shilov.training.utills.Waiting.*;

public class HiddenLayersExercisePage extends BasePage {

    @FindBy(id = "blueButton")
    private WebElement blueButton;

    @FindBy(id = "greenButton")
    private WebElement greenButton;

    public HiddenLayersExercisePage(WebDriver driver) {
        super(driver);
    }

    public HiddenLayersExercisePage clickBlueButton() {
        waitForBeingClickable(driver, 10, blueButton).click();
        return this;
    }

    public HiddenLayersExercisePage clickGreenButton() {
        waitForBeingClickable(driver, 10, greenButton).click();
        return this;
    }
}
