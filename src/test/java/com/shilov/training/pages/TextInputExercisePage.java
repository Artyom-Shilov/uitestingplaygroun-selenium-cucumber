package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.shilov.training.utills.Waiting.*;

public class TextInputExercisePage extends BasePage {

    @FindBy(id = "newButtonName")
    private WebElement inputForNewButtonName;

    @FindBy(id = "updatingButton")
    private WebElement buttonForNameChanging;

    private static final String  BUTTON_DEFAULT_NAME = "Button That Should Change it's Name Based on Input Value";

    public TextInputExercisePage(WebDriver driver) {
        super(driver);
    }

    public TextInputExercisePage enterNewNameForButton(String nameForButton) {
        waitForBeingClickable(driver, 10, inputForNewButtonName).sendKeys(nameForButton);
        return this;
    }

    public TextInputExercisePage applyNewNameForButton() {
        waitForBeingClickable(driver, 10, buttonForNameChanging).click();
        return this;
    }

    public String getButtonName() {
        new WebDriverWait(driver, Duration.ofSeconds(1)).until((ExpectedCondition<Boolean>) driver ->
                !buttonForNameChanging.getText().equals(BUTTON_DEFAULT_NAME));
        return buttonForNameChanging.getText();
    }
}
