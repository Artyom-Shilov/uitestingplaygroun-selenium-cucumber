package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AJAXDataExercisePage extends BasePage {

    @FindBy(id = "ajaxButton")
    private WebElement triggerButton;

    @FindBy(xpath = "//div[@id = 'content']/p")
    private WebElement appearedLabel;

    public AJAXDataExercisePage(WebDriver driver) {
        super(driver);
    }

    public AJAXDataExercisePage clickTriggerButton() {
        Waiting.waitForBeingClickable(driver, 10, triggerButton).click();
        return this;
    }

    public String getTextFromAppearedLabel() {
        return Waiting.waitForBeingClickable(driver, 16, appearedLabel).getText();
    }


}
