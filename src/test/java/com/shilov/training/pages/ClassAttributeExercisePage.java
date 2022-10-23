package com.shilov.training.pages;

import com.shilov.training.utills.Waiting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassAttributeExercisePage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'class3')]")
    private WebElement blueButton;

    public ClassAttributeExercisePage(WebDriver driver) {
        super(driver);
    }

    public ClassAttributeExercisePage clickBlueButton() {
        Waiting.waitForBeingClickable(driver, 10, blueButton).click();
        return this;
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public ClassAttributeExercisePage handleAlert() {
        driver.switchTo().alert().accept();
        return this;
    }
}
