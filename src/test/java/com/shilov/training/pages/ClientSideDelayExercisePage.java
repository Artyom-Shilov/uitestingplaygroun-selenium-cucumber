package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientSideDelayExercisePage extends BasePage {

    @FindBy(id = "ajaxButton")
    private WebElement triggerButton;

    @FindBy(xpath = "//div[@id = 'content']/p")
    private WebElement calculatedDataElement;

    public ClientSideDelayExercisePage(WebDriver driver) {
        super(driver);
    }

    public ClientSideDelayExercisePage clickTriggerButton() {
        Waiting.waitForBeingClickable(driver, 10, triggerButton).click();
        return this;
    }

    public String getCalculatedDataText() {
        return Waiting.waitForBeingClickable(driver, 16, calculatedDataElement).getText();
    }


}
