package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdExercisePage extends BasePage {

    @FindBy(xpath = "//button[@type = 'button' and @class = 'btn btn-primary']")
    private WebElement buttonWithDynamicId;

    public DynamicIdExercisePage(WebDriver driver) {
        super(driver);
    }

    public DynamicIdExercisePage clickButtonWithDynamicId() {
        Waiting.waitForBeingClickable(driver, 10, buttonWithDynamicId).click();
        return this;
    }
}
